class Emp
{
	int no;
	String name;
	float sal;
	public void Set(int n, String nm, float s)
	{
		no=n;
		name=nm;
		sal=s;
	}
	public void Show()
	{
		System.out.println("\n"+no+"\t"+name+"\t"+sal);
	}
}
	
class EmpArrayDemo
{
	public static void main(String []a) // Java Sign
	{
		Emp E[] = new Emp[2];
		E[0] = new Emp();
		E[1] = new Emp();
		E[0].Set(1001,"Abhishek",30000.00f);
		E[1].Set(1002,"Chetan ",30000.00f);
		E[0].Show();	
		E[1].Show();
	}
}
