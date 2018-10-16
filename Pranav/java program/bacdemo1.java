class account
{
	int ac_no;
	String name;
	String type;
	float bal;
		account(int ac,String n,String t, float b)
		{
		ac_no=ac;
		name=n;
		type=t;
		bal=b;
		}
		account()
		{
		ac_no=4566;
		name="hetal";
		type="saving";
		bal=5600.00f;
		}

void display()
{
System.out.println("ac no is:"+ ac_no+"\t"+"Name is: "+ name+"\t"+"type of ac:"+type+"\t"+"balance"+bal);

}
}
class bacdemo1
{
public static void main(String ar[])
{
account a1=new account(12000, "nirav","current",3400.00f);
account a2=new account();
a1.display();
a2.display();

}
}