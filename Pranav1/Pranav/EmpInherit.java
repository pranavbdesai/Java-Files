class Emp
{
	int EmpNo;
	String Name;
	public void Set(int E, String S)
	{
		EmpNo = E;
		Name =S;
	}
	public void Show()
	{
	System.out.println("\n"+EmpNo +"\t"+Name);
	}
}
class Salary extends Emp
{
	float bs,hra,da,ta,pf,net;
	public void SetSal(int e, String s, float b)
	{
		Set(e,s);
		Show();
		bs = b;
		hra = bs*0.12f;
		da = bs*0.06f;
		ta = bs*0.07f ;
		pf = (bs+hra)*0.14f;
		net = bs+hra+da+ta-pf;
		System.out.println("\n Basic Salary "+bs);
		System.out.println("\n HRA :" +hra);		
		System.out.println("\n  DA  :" +da);
		System.out.println("\n  TA :"+ta);
		System.out.println("\n PF :" + pf);
		System.out.println("\n Net salary "+net);
	}
}
class EmpInherit
{
	public static void main(String ar[])
	{
		Salary S = new Salary();
		S.SetSal(Integer.parseInt(ar[0]), ar[1], Float.parseFloat(ar[2]));
		//S.Show();
	}
}