import java.io.*;
class FileReaderDemo
{
	public static void main(String ar[])
	{
		try
		{
		FileReader Fr = new FileReader(ar[0]);
		BufferedReader Br = new BufferedReader(Fr);	
		String s="";
			while((s=Br.readLine())!=null)
			{
			System.out.println(s);
			}
		}
		catch(Exception e)
		{
	System.out.println("\n Error " +e);
		}
	}
}