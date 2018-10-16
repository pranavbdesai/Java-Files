/*Nested class 
class A
{
	...
	...
	..
	class B
	{
		int b;
		..
		..
	}
}
*/
class Outer
{
	String ox = " This is a Outer Class variable ";
	class Inner
	{
		private String ix =" This is a Inner Class varible ";
		public void Show()
		{
		System.out.println("Outer:  " + ox);
		System.out.println("Inner:  " + ix);
		}
	}
	public void Test()
	{
		Inner I = new Inner();
		I.Show();			
	}
}
			
class NestedDemo
{
	public static void main(String ar[])
	{
		Outer O  = new Outer();
		O.Test();
		System.out.println("\n Ix : " + O.ox);

	}

}	
	