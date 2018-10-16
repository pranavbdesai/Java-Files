class m
{
String name;
String salary;

	void setval(String n,String sal)
	{
		name=n;
		salary=sal;
	}

}
	class n extends m
	{
	double balance;
		 n(String na,String sa,double bal)
		{
		setval(na,sa);
		balance=bal;
		}
			public void show()
			{
			System.out.println("\t\t"+name+"\t\t"+salary);
			System.out.println("\t\t"+balance);
			}	
	}
class inherar
{
	public static void main(String s[])
	{	double d[]=new double[s.length];
		n n1[]=new n[5];
		int k=0;
		
			for(int i=0;i<s.length;i++)
			{
		 	k=3*i;
		 	d[i]=Double.parseDouble(s[k+3]);
			}	
				for(int i=0;i<5;i++)
				{
				k=3*i;
				n1[i]=new n(s[i],s[i+1],d[k]);
				}
		
		
	}
}