class IfDemo
{
	public static void main(String []ar)
	{
		int a=10,b=324,c=34;

		if(a>b)
		{
			if(a>c)
			{
		  	System.out.println(a+" is Max");
			}
			else
			{
			System.out.println(c+" is Max");
			}
		}
		else if(b>c)
		{
			System.out.println(b+" is Max");
		}
		else
		{
			System.out.println(c+" is Max");
		}
	}
}