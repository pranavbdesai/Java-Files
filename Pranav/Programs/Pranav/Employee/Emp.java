package Employee;
public class Emp implements Allowance
{
	public double net_sal;
	public String name;
	public double gross;
	public double gross_sal()
	{
		gross=net_sal+(net_sal*da)/100 + (net_sal*hra)/100;
		return(gross);
	}
	public Emp(double net,String n,double d)
		{
			net_sal=net;
			name=n;
		}
		public double tds()
		{
			if(gross<100000)
			{
				gross=gross+0;
				return gross;
			}
			else
			{
				gross=gross-((gross*10)/100);
				return gross;
			}
		}
}
