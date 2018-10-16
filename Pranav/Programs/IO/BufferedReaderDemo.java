import java.io.*;

class BufferedReaderDemo
{
	public static void main(String ar[]) throws Exception
	{
BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));	
	System.out.println("Enter the Name");
	String Str = Br.readLine();
	System.out.println("\n You Entered : " + Str);
	}
}