abstract  class Sample
{
	public  void Show()
	{
		System.out.println("From the Sample ");
	
	}
	abstract public final void Print();
/*	abstract public void Print1();
	abstract public void Print2();*/
}

class Derived extends Sample
{
	public void Disp()
	{
		System.out.println("\n From the Derived");
	}
	public void Print()
	{
		System.out.println("\n From Print Method");
	}
}

class AbstractDemo
{
	public static void main(String ar[])
	{
		Derived D = new Derived();
		D.Disp();
		D.Show();
                                     D.Print();
	}
 }