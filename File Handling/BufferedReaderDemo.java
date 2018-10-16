import java.io.*;

class BufferedReaderDemo
{
	public static void main(String ar[]) 
	{
		try
		{
			BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Name ");
			String Str = Br.readLine();
			System.out.println("Your Name  "  + Str);	
			String Str1 = Br.readLine();
			System.out.println("Your Name  "  + Str1);
		}
		catch(Exception e)
		{
			System.out.println("\n Error " +e);
		}
	}
}