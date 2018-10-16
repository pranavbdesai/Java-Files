class Sample
{
	int a,b;
	public Sample(int c, int d)
	{
		a=c;
		b=d;
	}
	public  void Show()
	{
	System.out.println("\n"+ a+"\t\t"+b);
	}
}
class Derived extends Sample
{
	int a;
	public Derived(int a, int b,int d)
	{
		super(a,b);//Call Super Class Constructor				
		this.a=d;		
	} 
	public void Show()
	{
		super.Show();
		System.out.println("\n A: "+a);
		System.out.println("\n Super A: "+super.a);
	}
}
class SuperDemo
{
	public static void main(String ar[])
	{
		Derived D = new Derived(20,41,67);
		D.Show();
	}
}