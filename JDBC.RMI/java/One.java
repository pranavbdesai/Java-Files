//without commandline argument
class Person
{
	String name;
	int age;
	float salary;
	void set()
	{
		name="BHRUGU";
		age=20;
		salary=350000;
	}
	void get()
	{
		System.out.println("NAME:  "+name+"\n\nAGE:  "+age+"\n\nSALARY:  "+salary);
	}
}

class One
{
	public static void main(String ar[])
	{
		Person P=new Person();
		P.set();
		P.get();		
	}
}