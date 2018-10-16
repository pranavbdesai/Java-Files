import java.io.*;
 
class InputStreamDemo
{
	public static void main(String ar[])
	{
	try
	{
	InputStream IR = new FileInputStream(ar[0]);
	int i;
	while((i=IR.read())!=-1)
	{
		System.out.print((char)i);
	}
	IR.close();
	}catch(IOException e)
	{
	System.out.println("Erro " + e);
	}
	}
}