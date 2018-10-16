class m
{
String name;
float salary;

	void setval(String n,float sal)
	{
		name=n;
		salary=sal;
	}

}
	class n extends m
	{
	double balance;
		 n(String na,float sa,double bal)
		{
		setval(na,sa);
		balance=bal;
		}
			public void show()
			{
			System.out.println("\t\t"+name+"\t\t"+salary);
			System.out.println("\t\t"+balance);
			}	
	}
class vm
{
	public static void main(String s[])
	{
		n n1=new n("nirav",1000.00f,10000);
		n1.show();
	}
}