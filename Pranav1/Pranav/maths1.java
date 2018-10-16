class Maths
{
	int q,i;
	float d;
	double e;
	int power(int a)
	{
		q=a*a;
		System.out.println("\n square:"+q);	
		return q;
	}
	int power(int x,int y)
	{
		int c=1;
		for(i=0;i<y;i++)
		{
			c=c*x;
		}
		System.out.println("\n int X^Y:-"+c);
		return c;
	}
	float power(float b)
	{
		d=b*b;
		System.out.println("\n float square:-"+d);
		return d;
	}
	float power(float x,int y)
	{
		float p=1;
		for(i=0;i<y;i++)
		{
			p=p*x;
		}
		System.out.println("\n float X^Y:"+p);
		return p;
	}
	double power(double b)
	{
		e=b*b;
		System.out.println("\n double square"+e);
		return e;
	}
	double power(double x,int y)
	{
		double r=1;
		for(i=0;i<y;i++)
		{
			r=r*x;
		}
		System.out.println("\n double X^Y:"+r);
		return r;
	}

}
class Maths1
{
	public static void main(String ar[])
	{
		Maths  S=new Maths();
		S.power(2);
		S.power(3,3);
		S.power(2.2f);
		S.power(2.2f,2);
		S.power(2.22);
		S.power(2.22,2);
	}
}
	

	
