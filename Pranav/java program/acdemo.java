class account
{
	int ac_no;
	String name;
	String type;
	float bal;
		public void set()
		{
		ac_no=129000;
		name="nirav";
		type="saving";
		bal=128900f;
		}

void display()
{
System.out.println("ac no is:"+ ac_no+"\t"+"Name is: "+ name+"\t"+"type of ac:"+type+"\t"+"balance"+bal);

}
}
class acdemo
{
public static void main(String ar[])
{
account a1=new account();
a1.set();
a1.display();

}
}