class person
{
	String name;
	int age;
	float salary;
	
	public void set(String a,int b,float c)
	{
		name=a;
		age=b;
		salary=c;
	}
	public void show()
	{
		System.out.println("\n Name:"+name);
		System.out.println("\n Age    :"+age);
		System.out.println("\n Salary:"+salary);
	}
}
class persondemo
{
	public static void main(String ar[])
	{
	person p=new person();
	p.set(ar[0],Integer.parseInt(ar[1]),Float.parseFloat(ar[2]));
	p.show();
	}
}