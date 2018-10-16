class ArrayDemo
{
	public static void main(String ar[])
	{
		int a[ ] = new int[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=i*100;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\n\t\t a["+i + "] "  + a[i]);
		}	

	}
}