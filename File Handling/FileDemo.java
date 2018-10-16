/* File Handling */

import java.io.*;

public class FileDemo
{
	public static void main(String ar[])
	{
		File F = new File("z:/java");
		System.out.println("is Exist : " + F.exists());
		System.out.println("Can read  : "+ F.canRead());
		System.out.println("Can Write  : "+ F.canWrite());
		System.out.println("Name : "+ F.getName());
		System.out.println("Path  : "+ F.getAbsolutePath());
		System.out.println("Length : "+ F.length());
		System.out.println("is File : "+ F.isFile());
		System.out.println("is Directory : "+ F.isDirectory());
		String L[] = F.list();
		
		for(int i=0;i<L.length;i++)
		{
			File T = new File("Z:/java/"+L[i]);
	   	if(T.isDirectory())
			System.out.println("\t\t "+ L[i] + "  Dirctory");
		else
			System.out.println("\t\t "+ L[i] + "  File and SIze " + L[i].length());	
		}
	}
}