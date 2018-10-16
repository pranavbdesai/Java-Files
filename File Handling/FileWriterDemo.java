import java.io.*;
class FileWriterDemo
{
	public static void main(String ar[])
	{
		try
		{
		FileReader Fr = new FileReader(ar[0]);
		FileWriter Fw = new FileWriter(ar[1]);
		BufferedReader Br = new BufferedReader(Fr);	
		String s="";
			while((s=Br.readLine())!=null)
			{
			Fw.write(s+"\n");
			System.out.println(s);
			}
			Fw.close();
		Fr.close();
		}
		catch(Exception e)
		{
	System.out.println("\n Error " +e);
		}
	}
}