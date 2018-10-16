class Parent
{
}
class Child extends Parent
{
}
class ObjectReferenceVariable
{
	public static void main(String ar[])
	{
		Parent p;
		p=new Parent();
		Child c;
		c=new Child();
		//c=new Parent();	error:- Incompatibal type			
	}
}
	

