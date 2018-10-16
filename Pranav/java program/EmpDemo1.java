class Emp1
{
	int No;
	String Name;

	private float Sal;

 	public void Set(int n, String s, float f)
	{
		No=n;
		Name=s;
		Sal=f;
	}
	public void Show()
	{
		System.out.println("\n"+No+"\t"+Name+"\t"+Sal);
	}
	public float GetSal()
	{
		return Sal;
	}
}
class EmpDemo1
{
	public static void main(String ar[])
	{
		Emp1 E = new Emp1();
		E.Set(1001,"Rathod Nirav",25000);
		Emp1 E1 = new Emp1();
		E1.Set(1002,"Mukesh Shah",250000);
		E.Show();
		E1.Show();
		if(E.GetSal()>E1.GetSal())
		{
		System.out.println("\n"+E.Name +" is Higher Salary");
		}
		else
		{
System.out.println("\n"+E1.Name +" is Higher Salary");
		}
	}
}