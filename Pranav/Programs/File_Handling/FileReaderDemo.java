import java.io.*;

public class FileReaderDemo
{
	public  static void main(String ar[]) throws Exception
	{
	FileReader Fr = new FileReader(ar[0]);
	BufferedReader Br = new BufferedReader(Fr);
	String Str="";
	while((Str=Br.readLine())!=null)
	{
	System.out.println(Str);
	}

	}
}