package Employee;
class Emp
{
	double net_sal;
	String name;
	double DA;
	double gross;
	double gross_sal()
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
		double tds()
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
