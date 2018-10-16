class D
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int a[]=new int [n];
		for(int i=0;i<n;i++)
		{
			a[i]=Integer.parseInt(args[i++]);
		}
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
				count=count+1;
				}
			}
		System.out.println(a[i]+"duplicate"+ count +"time");
		}
	}
}	 