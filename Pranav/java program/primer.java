class primer 
{
	int n;
	public static void main(String ar[])
	{
	int count=0;
	int j,i;
	int n=Integer.parseInt(ar[0]);
	System.out.println("thr number of element is:"+"\t\t"+ar[0]);
		for(j=2;j<=n;j++)
		{
			 i=j;
			for(int k=2;k<=n;k++)
			{
				if(i%k==0)
				{
				count++;
				}
			}
				if(count==1)
				{
				System.out .println("the number is prime:"+i);
				}
		count=0;
		}
	}

}