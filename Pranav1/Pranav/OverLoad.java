class OverloadDemo
{
		void test()
		{
			System.out.println("No Parameters");
		}
		void test(int a)
		{
			System.out.println("A:"+a);
		}
		void test(int a,int b)
		{
			System.out.println("B:"+a);	
		}
		double test(double a)
		{
			System.out.println("double A:"+a);
			return a*a;
		}
}
class OverLoad
{
		public static void main(String[] ar)
		{
		OverloadDemo ob=new OverloadDemo();
		ob.test();
		ob.test(1);
		ob.test(10,20);
		double result;
		result =ob.test(123.25);
	System.out.println("Result of ob.test(123.25)"+result);
		}
}


