class Directory
{
	int num1,num2;
	String name1;
	String name2;
	void in()
	{
		num1=225415;
		num2=225416;
		name1="BHRUGU";
		name2="DHARMIK";
	}
	
	void out()
	{
		System.out.println("\n"+name1+"\t"+num1+"\n"+name2+"\t"+num2);
	}
}

class Sub
{
	public static void main(String ar[])
	{
		Directory D=new Directory();
		D.in();
		D.out();
	}
}