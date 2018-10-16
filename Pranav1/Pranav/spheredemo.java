 class sphere
{
	double  radius;
	double  a;
	double b;
	public void set(double x,double y,double z)
	{
		radius=x;
		a=y;
		b=z;
	}
	public void show()
	{
		System.out.println("\n Radius:"+radius);
		System.out.println("\n Co-ordinate is:"+a+","+b);
	}
}
class spheredemo
{
	public static void main(String ar[])
	{
		sphere s=new sphere();
		s.set(Double.parseDouble(ar[0]),Double.parseDouble(ar[1]),Double.parseDouble(ar[2]));
		s.show();
	}
}