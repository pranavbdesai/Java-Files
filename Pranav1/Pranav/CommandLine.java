class commandline 
{
	public static void main(String args[])
	{
		int sum=0;
		for(int i=0; i<args.length; i++)
		{
			sum = sum + Integer.parseInt(args[i]);
			System.out.println("args[" + i + "]: " + args[i]);
		}
		//System.out.println("Name " + args[0] + " " + args[1]);
		System.out.println("\n Total : " + sum);
	}
}