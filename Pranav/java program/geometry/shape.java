package geometry;

public abstract class shape
{
	int d1;
	int d2;
	public abstract float cal_a();
		public shape(int di1,int di2)
		{
		d1=di1;
		d2=di2;
		System.out.println("the value of dimension is:"+d1+d2);
		}

}