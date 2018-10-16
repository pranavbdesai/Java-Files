class account
{
	int ac_no;
	String name;
	String type;
	float bal;
		public void set(int ac,String n,String t, float b)
		{
		ac_no=ac;
		name=n;
		type=t;
		bal=b;
		}

void display()
{
System.out.println("ac no is:"+ ac_no+"\t"+"Name is: "+ name+"\t"+"type of ac:"+type+"\t"+"balance"+bal);

}
}
class acdemo1
{
public static void main(String ar[])
{
account a1=new account();
a1.set(12000, "nirav","current",3400.00f);
a1.display();

}
}