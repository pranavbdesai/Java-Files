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
	
class CmdEmpDemo
{
	public static void main(String []a)
	{
		Emp E = new Emp();
		E.Set(Integer.parseInt(a[0]),a[1],Float.parseFloat(a[2]));
		E.Show();
	
	}
}
