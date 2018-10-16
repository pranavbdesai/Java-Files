class bank
{
	String name;
	int no;
	String type;
	int bal;
	int withdraw;
	public void get(String a,int b,String c,int d,int e)
	{
		name=a;
		no=b;
		type=c;
		bal=d;
		withdraw=e;
	}
	public void withdraw()
	{
		System.out.println("\n How many rupee you want to withdraw?"+withdraw);
		if(withdraw>=bal-1000)
		{
			System.out.println("\n Sorry!! 1000 must be there in your account");
		}
		else
		{
			System.out.println("\n Transection completed");
		}
	}
	public void show()
	{
		System.out.println("\n Name:"+name);
		System.out.println("\n Balance:"+bal);
		//System.out.println("\n Withdrawn amount:"+withdraw);
	}
}
class bankdemo
{
	public static void main(String ar[])
	{
		bank b=new bank();
		b.get(ar[0],Integer.parseInt(ar[1]),ar[2],Integer.parseInt(ar[3]),Integer.parseInt(ar[4]));
		b.withdraw();
		b.show();
	}
}
		