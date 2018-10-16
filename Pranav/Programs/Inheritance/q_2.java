class N
{
	public float m1,m2;
	public String nm;
	public void get(String n,float a,float b)
	{
		m1=a;
		m2=b;
		nm=n;
	}
}
class M extends N
{
	double p;
	public void set()
	{
		p=m1+m2;
	}
	public void setmethod()
	{
		System.out.println("Name="+nm+"\tSub1="+m1+"\tSub2="+m2+"\t Total="+p);
	}
}
class Q_2
{
	public static void main(String ar[])
	{
		M s=new M();
		s.get("Jaimini",56.5f,78.5f);
		s.set();
		s.setmethod();
	}
}