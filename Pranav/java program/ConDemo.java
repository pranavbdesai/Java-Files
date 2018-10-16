class Emp
{
	int No;
	String Name;
	private float Sal;
	public Emp()
	{
		No=10001;
		Name="Rathod Nirav";
		Sal=250000.00f;
	}
	public Emp(int No, String s , float f)
	{
		this.No=No;
		Name=s;
		Sal=f;
	}
	public void Show()
	{
	System.out.println("\n"+No+"\t"+Name+"\t"+Sal);
	}
}

class ConDemo
{
	public static void main(String ar[])
	{
		Emp E = new Emp();
		Emp E1 =new Emp(1002,"Mukesh Shah",300000);
		E.Show();
		E1.Show();
	}
}