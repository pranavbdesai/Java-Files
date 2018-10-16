import java.net.*;
import java.io.*;

class DatagramServer
{
	public static DatagramSocket ds;
	public static byte buffer[] = new byte[1024];
	public static int clientport = 789,serverport=790;
	
	public static void main(String args[]) throws Exception
	{
		
		ds = new DatagramSocket(serverport);
		BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Server Waiting for Input");
		InetAddress ia = InetAddress.getByName("bestcc-101.BESTHO.VVN.COM");
		System.out.println("Addres : " + ia);
		while(true)
		{
		  	String str = dis.readLine();
			if(str==null || str.equals("end"))
				break;
			buffer =str.getBytes();
ds.send(new DatagramPacket(buffer,str.length(),ia,clientport));
		}
	}
}
		