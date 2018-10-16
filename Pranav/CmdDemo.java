class CmdDemo
{
	public static void main(String ar[])
	{
		int sum=0;
		for(int i=0; i<ar.length;i++)
		{
			System.out.println("\n\n "+ ar[i]);
			sum += Integer.parseInt(ar[i]); //Float.parseFloat(ar[i]);
		}
		System.out.println("Sum :" +  sum);
	}
}