class SalaryExceed extends Exception
{
	public String toString() 
	{
		return"\nSalary Greater than Errors";
	}
	/*public String getMessage() 
	{
		return"\nSalary is Greater";
	}*/
}	
class UserDefine
{
	public static void main(String ar[])
	{
		try
		{
			int a=Integer.parseInt(ar[0]);
			if(a>=50000)
				throw new SalaryExceed();
			else
				System.out.println("\n Salary is Accepted");		
		}	
		catch(NumberFormatException e)
		{
			System.out.println("\n Numeric Value");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\n Array Bounced");
		}
		catch(SalaryExceed s)
		{
			System.out.println("\n Error  "+s);
		}
	}
}