/*
	How to create a classs.

class ClassName
{
	access datatype variabl,,,,,;
	access datatype variabl,,,,,;
	access datatype variabl,,,,,;
	access returnTYpe FunName(ARg..)
	{
	}
	access returnTYpe FunName1(ARg..)
	{
	}
	access returnTYpe FunName2(ARg..)
	{
	}
}
*/

class Emp
{
	public int no;
	public String Name;
	float sal;
	public Emp()
	{
		no=1111;
		Name="Dharmik Pandya";
		sal=250000.00f;
	}
	public Emp(int no, String Name, float sal)
	{
		this.no=no;
		this.Name=Name;
		this.sal=sal;
	}
	
	void Show()
	{
	System.out.println("\n "+ no +"\t"+Name +"\t"+sal);
	}
}

class ThisDemo
{
	public static void main(String ar[])
	{
	Emp E = new Emp(); //Creating an object of class Emp
	Emp E1 = new Emp(1002,"Mukesh Shah",25000.00f);
	Emp E2 = new Emp(1003,"Bhrugu ",25000.00f);
		E.Show();	
		E1.Show();
		E2.Show();
	}
}