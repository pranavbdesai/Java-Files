class person
{
	String name;
	int age;
	float salary;
	person()
	{
		name="Nirav";
		age=20;
		salary=45000.00f;
	}
}
class maine
{
public static void main(String ar[])
{
person p1=new person();
System.out.println("the data  of person is:"+"name is:"+name+"\t"+"age is:"+age+"\t"+"salary is:"+salary+"\t");

}
}