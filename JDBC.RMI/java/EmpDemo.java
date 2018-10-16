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


 
class student
{
	public int rno;
	public String Name;
	float marks;
	void Get(int rn , String s, float f)
	{
		rno=n;
		Name=s;
		marks=f;
	}
	void Show()
	{
	System.out.println("\n "+ rno +"\t"+Name +"\t"+marks);
	}
}

class studentDemo
{
	public static void main(String ar[])
	{
		student E = new student(); //Creating an object of class Emp
		student E1 = new student();
		E.Get();
		E.Show();
	}
}