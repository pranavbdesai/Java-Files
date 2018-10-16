class Emp
{
	int No;
	String Name;
	private float Sal;
	public void Set()
	{
		No=10001;
		Name="Rathod Nirav";
		Sal=250000.00f;
	}
	public void Show()
	{
	System.out.println("\n"+No+"\t"+Name+"\t"+Sal);
	}
}

class EmpDemo
{
	public static void main(String ar[])
	{
		Emp E = new Emp();
		E.Set();
		E.Show();
	}
}