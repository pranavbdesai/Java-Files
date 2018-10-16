package geometry;

public class square extends shape
{
	float sa;
	public square(int di1,int di2)
	{
	super(di1,di2);
	}
		public float cal_a()
		{
		sa=(float)d1*d2;
System.out.println("The area of rectangle is:"+sa);
		return sa;
		
		
		}
}