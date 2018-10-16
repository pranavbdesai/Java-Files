class Srno extends Exception
{
	public String toString() 
	{
		return "\nException Generated";
	}
	
}	
class ID
{
	public static void main(String ar[])
	{
		try
		{
			System.out.println("Year " + ar[0].substring(0,2));
			System.out.println("Second " + ar[0].substring(2,4));
			System.out.println("Srno " + ar[0].substring(4,6));
			int yr= Integer.parseInt(ar[0].substring(0,2));
			String strm = ar[0].substring(2,4);
			int sr = Integer.parseInt(ar[0].substring(4,ar[0].length()));
			
			if( yr!=11 || strm.equals("IT") || strm.equals("CP") || (sr<0 || sr>99))
				throw new Srno();
			else
				System.out.println("ur no is right");
		}
		catch(NumberFormatException e)
		{
			System.out.println("\n wrong no. ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\n Array Bounced");
		}
		catch(Srno s)
		{
			System.out.println("\n Error  "+s);
		}
	}
}