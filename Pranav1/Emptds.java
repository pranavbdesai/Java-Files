import Employee.Emp;

class Emptds
{
	public static void main(String s[])
	{
		Emp e1=new Emp(Double.parseDouble(s[0]),s[1],Double.parseDouble(s[2]));
		System.out.println("NAME="+e1.name);
		System.out.println("GROSS SALARY="+e1.gross_sal());
		System.out.println("GROSS SALARY AFTER TDS="+e1.tds());
		System.out.println("BASIC SALARY="+e1.net_sal);
		System.out.println("DEARNESS ALLOWANCE="+e1.da);
	}
}