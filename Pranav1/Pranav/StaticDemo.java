class Account
{
	int ac;
	String name;
	static int a=10001;
	final float bal=5000.00f; //Cannot Change its Value 
	
	public Account(String n)
	{
		ac=a++;
		name=n;		
	}
	public void Show()
	{
		System.out.println("\t"+ac+"\t"+name);
	}
}
class StaticDemo
{
                 
	static String Name="BITNET INFOSYS";
	
	public static void main(String ar[])
	{
	System.out.println("Name " + Name);
	System.out.println("A : " +Account.a);
	 Account A = new Account("Mukesh");
	 Account B = new Account("Shikha");
 	 Account C = new Account("CDAC");
	A.Show();
	B.Show();
	C.Show();
	System.out.println("A "  + A.a);
	System.out.println("A "  + B.a);
	System.out.println("A "  + C.a);
	System.out.println("A "  + Account.a);
	}
}		