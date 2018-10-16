class SalaryExceed extends Exception
{
	public String toString() //Convert Object to String
	{
		return "Salary Exception Generated";
	}
	public String GetMessage(int n)
	{
		return n + " is a High Salary ";	
	}
}
class UserDefine
{
	public static void main(String ar[])
	{
		int a =0;
		try
		{
			a = Integer.parseInt(ar[0]);
			if(a>=50000)
			{	throw new SalaryExceed();
	//			SalaryExceed S=new SalaryExceed();
			}
			else
	   	          System.out.println("Salary is Accepted");
		}
		catch(SalaryExceed S)
		{
		System.out.println("Error :::" + S );
		System.out.println("Error : " +S.GetMessage(a) );
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Value to Input Karo Mere Bhai");
		}
	}
}

/*
	class ExcepName extends Exception	
	{
		public String toString()
		{
			return "Message Here";
		}
		...
		...	mETHODS 
	}
	class ClassName
	{
		try
		{
			..
			..
				throw new ExcepName();
		}
		catch(ExcepName Obj)
		{
			System.out.println(Obj);
		}
	}
	*/