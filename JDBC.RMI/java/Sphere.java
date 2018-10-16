class SphereDemo
{
	double radius;
	double co_x,co_y;
	void set()
	{
		radius=132;
		co_x=12;
		co_y=15;
	}
	void show()
	{
		System.out.println("\nRadius  :"+radius+"\nCo-ordinate of X  :"+co_x+"\nCo-ordinate of Y :"+co_y);
	}
}
class Sphere
{
	public static void main(String ar[])
	{
		SphereDemo SD=new SphereDemo();
		SD.set();
		SD.show();
	}
}