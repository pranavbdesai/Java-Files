class Caller 
{
	synchronized   void  Test(String Msg)
	{
		System.out.print("[ ");
		try
		{
			System.out.print(Msg);
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{

		}
		System.out.println(" ]");
	}
}
class CallMe extends Thread
{
	Caller C ;
	Thread T ;
	String msg;
	public CallMe(Caller P, String s)
	{
		msg=s;
		C=P;
		T = new Thread(this,msg);	
		T.start();
	}
	public void run()
	{
		C.Test(msg);
	}
}

class Sync
{
	public static void main(String arp[])
	{
		Caller C = new Caller();
		CallMe C1 = new CallMe(C,"BeST");
		CallMe C2 = new CallMe(C,"COMPUTER");
		CallMe C3 = new CallMe(C,"CENTER");
	}
}