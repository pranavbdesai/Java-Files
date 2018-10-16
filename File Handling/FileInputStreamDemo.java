import java.io.*;
public class FileInputStreamDemo
{
	public static void main(String ar[])
	{
	try
	{	
		InputStream In = new FileInputStream(ar[0]);
		int i=0;	
		while((i=In.read())!=-1)   // (-1 End Of FILE)
		{
			System.out.print((char)i);	
		}
		In.close();
	}catch(IOException e)
	{
		System.out.println("Error : " +e);
	}
	}
}
