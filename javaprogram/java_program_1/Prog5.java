import java.net.*;
import java.io.*;
class Prog5
   {
           public static int serverPort=998;
           public static int count=0;
           public static int clientPort=999;
           public static int buffer_size=1024;
           public static DatagramSocket ds;
           public static byte buffer[]=new byte[buffer_size];

           public static void TheServer() throws Exception 
           {
              while(true)
                  {
                    int pos=0;
                    DatagramPacket p=new DatagramPacket(buffer,buffer.length);
                    ds.receive(p);
                    String m=new String(p.getData(),0,p.getLength());
                    int l=m.length();
                    char ch=m.charAt(l-1);
                    String n=m.substring(0,l-1);
                    FileReader f=new FileReader(n);
                     for(int i=0;(i=f.read())!=-1;i++)
                        {
                          char r=(char)i;
                          if(r==ch) count++;
                        }
                    System.out.print("Occurence of char "+ch+" in file "+n+" is "+count);
                   }
          }
         public static void TheClient() throws Exception 
           {
              int pos=0;
              while(true)
                     {
                       int c=System.in.read();
                       switch(c)
                        {
                            case -1:
                            System.out.println("Client Quits");
                            return;
                            case '\r':
                            break;
                            case '\n':
                            ds.send(new DatagramPacket(buffer,pos,InetAddress.getLocalHost(),serverPort));
                            pos=0;
                            break;
                            default:
                            buffer[pos++]=(byte) c;
                        }
                     }
          }
        public static void main(String s[]) throws Exception
             {
                if(s.length==1)
                {
                  ds=new DatagramSocket(serverPort);
                  TheServer();
                 }
                else
               {
                  ds=new DatagramSocket(clientPort);
                  TheClient();
                }
            }
}
