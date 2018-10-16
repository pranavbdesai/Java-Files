package Employee;
public class Emp
{
	public double net_sal;
	public String name;
	public double DA;
	public double gross;
	public double gross_sal()
	{
		gross=net_sal+(net_sal*DA)/100;
		return(gross);
	}
	Emp(double net,String n,double d)
		{
			net_sal=net;
			name=n;
			DA=d;
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
