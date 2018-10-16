class account
{
	int ac;
	String name;
	static int a=11111;
	float bal=5000.00f;
	public account(String n)
	{
		name=n;
		ac=a++;
	}
	public void show()
	{
		System.out.println("\n \t"+ac+"\t \t"+name);
	}
}
class stademo
{
	static String name="Bitnet Infosis";
	public static void main(String ar[])
	{
		System.out.println("\n Name:"+name);
		System.out.println("\n A:"+account.a);
		account a=new account("Bansari");
		account b=new account("Nirali");
		account c=new account("Vismita");
	
		a.show();
		b.show();
		c.show();
	}
}
	