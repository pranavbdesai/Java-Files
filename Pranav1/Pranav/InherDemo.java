class Base
{
	protected int a=100;
	public void Show()
	{
	System.out.println("In The base ");
	}
}
class Derived extends Base
{
	int a=343;
	public void Show()
	{
		super.Show();
		System.out.println("In the Derived " +a );
		System.out.println("In the Derived " +super.a );
	}
}
class InherDemo
{
	public static void main(String ar[])
	{
		Derived D = new Derived();
		D.Show();
	}
}