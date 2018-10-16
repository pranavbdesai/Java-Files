class adit
{
	String name;
	public void set(String a)
	{
		name=a;
	}
	public void show()
	{
		System.out.println("\n Name of adition:"+name);
	}
}
class gcet extends adit
{
	String n;
	public void set(String a,String b)
	{	
		super.set(a);
		n=b;
	}
	public void show()
	{
		super.show();
		System.out.println("\n Name of gcetion:"+n);
	}
}
class bvm extends adit
{
	String nm;
	public void set(String a,String b,String c)
	{
		super.set(a);
                                    nm=c;
	}
	public void show()
	{
		super.show();
		System.out.println("\n Name of bvmite:"+nm);
	}
}
class clg
{
	public static void main(String ar[])
	{
		gcet g=new gcet();
		g.set(ar[0],ar[1]);
		g.show();
		bvm p=new bvm();
		p.set(ar[0],ar[1],ar[2]);
		p.show();
	}
}
		