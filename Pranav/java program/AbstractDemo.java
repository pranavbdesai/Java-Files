abstract class  Sample
{
	String name="Sample Class";
	abstract public void Show();
	public void print()
	{
		System.out.println("\n In the Print Method ");
	}
}
class Derived extends Sample
{
	public void Show()
	{
		System.out.println("\n From Show " + name);
	}
}

class AbstractDemo
{
	public static void main(String ar[])
	{
		Derived D = new Derived();
		//Sample S= new Sample();
		Sample S = new Derived();
		S.Show();
		S.print();
		D.Show();
		D.print();
	}
}