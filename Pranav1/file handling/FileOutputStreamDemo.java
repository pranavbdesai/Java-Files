import java.io.*;
public class FileOutputStreamDemo
{
	public static void main(String ar[])
	{
	try
	{	
OutputStream Out = new FileOutputStream(ar[0]);
	String Msg="Hello everyone \n How r u? ";
	
	byte buf[] = Msg.getBytes();
	Out.write(buf);
	Out.close();
	}
	catch(Exception e)
	{
	System.out.println("Error  " + e);
	}	
	}
}
