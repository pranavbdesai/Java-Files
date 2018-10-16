import java.io.*;
public class CopyFile
{
	public static void main(String ar[])
	{
		try
		{	
			OutputStream Out = new FileOutputStream(ar[0]);
			InputStream in = new FileInputStream(ar[1]);
			int i ;
			while((i=in.read())!=-1)
			{
				Out.write(i);
			}
			Out.close();
			in.close();
		}
		catch(Exception e)
		{
			System.out.println("Error  " + e);
		}	
	}
}
