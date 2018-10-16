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
	void Get()
	{
		no=1111;
		Name="Dharmik Pandya";
		sal=250000.00f;
	}
	void Show()
	{
	System.out.println("\n "+ no +"\t"+Name +"\t"+sal);
	}
}

class EmpDemo
{
	public static void main(String ar[])
	{
		Emp E = new Emp(); //Creating an object of class Emp
		Emp E1 = new Emp();
		E.Get();
		E.Show();
	}
}