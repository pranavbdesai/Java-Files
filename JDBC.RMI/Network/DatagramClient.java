import java.net.*;
import java.io.*;

class DatagramClient
{
	public static DatagramSocket ds;
	public static byte buffer[] = new byte[1024];
	public static int clientport = 789,serverport=790;
	public static void main(String args[]) throws Exception
	{
	ds = new DatagramSocket(clientport);
	System.out.println("Client is Waiting for Server to Send Data");
	System.out.println("Press Ctrl+C to come Dos Prompt");
	while(true)
	{
		DatagramPacket p = new DatagramPacket(buffer,buffer.length);
		ds.receive(p);
		String psx= new String(p.getData(),0,p.getLength());
		System.out.println(psx);
	}
    }
}

