class Hello
{
	public static void main(String ar[])
	{
	int a=10,b=23,c=45,d=55;
	System.out.println("Welcome to World of Java");
	System.out.println("\n Total "+ (a+b+c+d));
	if(a>b&&a>c&&a>d)
	{
		System.out.println("\n Max is " +a);	
	}
	else if(b>a&&b>c&&b>d)
	{
		System.out.println("\n Max is " +b );
	}
	else if(c>a&&c>b&&c>d)
	{
		System.out.println("\n Max is " +c);
	}
	else if(d>a&&d>b&&d>c)
	{
		System.out.println("\n Max is " +d);
	}
	for(int i=1;i<=10;i++)
	{
	System.out.print(i +"\n,"); 
	}
	}
}