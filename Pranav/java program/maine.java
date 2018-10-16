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
System.out.println("the data  of person is:"+"name is:"+p1.name+"\t"+"age is:"+p1.age+"\t"+"salary is:"+p1.salary);

}
}