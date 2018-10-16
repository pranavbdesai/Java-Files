class IfDemo1
{
	public static void main(String []ar)
	{
		int a=10,b=324,c=34;

		if(a>b && a>c)
		{
		  	System.out.println(a+" is Max");
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