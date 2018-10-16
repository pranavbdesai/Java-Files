package strmani;

public class mystring
{
	static String name="nirav rathod";
		int count=0;
		int i=0;
		char a[]=name.toCharArray();
		char d[]=new char[a.length];
			public void cal_l()
			{
				while((i<a.length) )
				{
 					if(a[i]!=' ')
					{
					count++;
					}
					i++;
				}
			System.out.println("the length of the String is::"+count);
		
			}
			public void reverse()
			{
				for(int k=0;k<a.length;k++)
				{	
					if(a[k]!=' ')
					{
					d[k]=a[k];
					}
					a[k]=a[count-k];
			
				}
				for(int k=0;k<a.length;k++)
				{
					a[count-k]=d[k];
				}
		
				for(int k=0;k<a.length;k++)
				{
					System.out.print(a[k]);
				}
			}//End of Fun
		public void search()
		{
				System.out.println("\n enter the char:"+'n');
	
			for(int k=0;k<a.length;k++)
			{
				if(a[k]=='n')
				{
			System.out.println("the position of element is:"+k);
			
				}
			}
		}//End of Fun	
}