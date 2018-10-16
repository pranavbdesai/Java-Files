class Throws
{
	public void show() throws ArithmeticException
	{
		System.out.println("\n In the show method");
		try
		{
			throw new ArithmeticException();
		}
		catch(NumberFormatException e)
		{
			System.out.println("\n Number Format");
		}
		finally
		{
			System.out.println("\n End of Function");
		}
	}
}
class ThrowsManually
{
	public static void main(String ar[])
	{
		try
		{
			Throws T=new Throws();
			T.show();
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n Arithmetic Exception throws");
		}
	}
}