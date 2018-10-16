import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.net.*;
import java.lang.Runtime;
import java.util.Properties;
 

public class RmiServer extends java.rmi.server.UnicastRemoteObject implements ReceiveMessageInterface 
{
   Runtime r = Runtime.getRuntime();
   Process p=null;
   String s = System.getProperty("os.name");

    int      thisPort;
    String   thisAddress;
    Registry registry;    
    // rmi registry for lookup the remote objects.
    // This method is called from the remote client by the RMI.
   // This is the implementation of the “ReceiveMessageInterface”.
    /*start from here*/
	
  public void receiveMessage(String x) throws RemoteException
    {
        System.out.println(x);
    }
   public  void ShutDown() throws Exception
   {
	if(s.equals("Windows XP")==true) {
          	System.out.println("\n In the True \n The Value of S : " + s);
            p = r.exec("shutdown -f -s -t 00");
        }
        else if(s.equals("Windows 98") == true) {
            p = r.exec("rundll32.exe Shell32.dll,SHExitWindowsEx 1");
        }

}
   public    void Restart() throws Exception
  {
	 if(s.equals("Windows XP")==true) 
	{
	  p = r.exec("shutdown -f -r -t 00");
        }
        	else if(s.equals("Windows 98") == true) 
	{
	            p = r.exec("rundll32.exe Shell32.dll,SHExitWindowsEx 2");
        	}
  }
     public  void LogOff() throws Exception
   {
	if(s.equals("Windows XP")==true) {
            			p = r.exec("shutdown -l -f");
      	  }
        	else if(s.equals("Windows 98") == true) {
          		  p = r.exec("rundll32.exe Shell32.dll,SHExitWindowsEx 0");
        }

   }
    public RmiServer() throws RemoteException
    {
        try{
            // get the address of this host.
            thisAddress= (InetAddress.getLocalHost()).toString();
        }
        catch(Exception e){
            throw new RemoteException("can't get inet address.");
        }
	thisPort=3232;  // this port(registry’s port)
        System.out.println("this address="+thisAddress+",port="+thisPort);
        try{

	       // create the registry and bind the name and object.

	registry = LocateRegistry.createRegistry( thisPort );
            	registry.rebind("rmiServer", this); 
       }

        catch(RemoteException e){
        throw e;
        }

    }

    

    static public void main(String args[])
   {

        try{
        RmiServer s=new RmiServer();
    } 

    catch (Exception e) {

           e.printStackTrace();

           System.exit(1);

    }

     }

}

