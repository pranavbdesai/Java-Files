class Base
{
	int a=199;
	public void Print()
	{
		System.out.println("\n"+a);
	}
}
class Derived extends Base
{
	int b=300;
	public void Show()	
	{
		System.out.println("\n From derived : " +a);
		System.out.println("\n " +b);
	}
}
class Inherit
{
	public static void main(String ar[])
	{
		Derived D = new Derived();
		D.Print();
		D.Show();
	}
}
/*
	Student
		RollNo
		Name
	Result
		M1
		M2
		Per
		Grade
*/