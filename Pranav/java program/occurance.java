class occurance
{
	public static void main(String ar[])
	{
		int count=0;
		
		int a [] = new int[ar.length];
		for(int i=0;i<a.length;i++)
		{
			a[i] = Integer.parseInt(ar[i]);
			System.out.println("\n\t  "+(i+1) +"\t"+ a[i]);
		}
		int c = Integer.parseInt(ar[ar.length-1]);
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==c)
				{
			count++;
			System.out.println("The occurance of element:"+(i+1));
				}
		
			}
			System.out.println("count is:"+count);
	}
	
}