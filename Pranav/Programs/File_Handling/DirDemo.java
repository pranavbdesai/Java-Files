import java.io.*;

class DirDemo
{
	public static void main(String ar[])
	{
		File F = new File(ar[0]);
		if(F.isDirectory())
		{
		String Str[] = F.list();
		for(int i=0;i<Str.length;i++)
		{
		System.out.print("\n\t\t " + Str[i]);
		File P  = new File(ar[0]+"/"+Str[i]);
		if(P.isDirectory())
		 System.out.println(" \t Directory ");
		else
		 System.out.println(" \t File ");

		}

		}
	}
}