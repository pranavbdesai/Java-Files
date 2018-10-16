class box
{
	int width,length,depth;
	public void set(int a,int b,int c)
	{
		width=a;
		length=b;
		depth=c;
	}
	public void show()
	{
		System.out.println("\n Width is:"+width);
		System.out.println("\n Length is:"+length);
		System.out.println("\n Depth is:"+depth);
		System.out.println("\n Area of box is:"+(width*length*depth));
	}
}
class boxdemo
{
	public static void main(String ar[])
	{
		box Mybox=new box();
		Mybox.set(Integer.parseInt(ar[0]),Integer.parseInt(ar[1]),Integer.parseInt(ar[2]));
		Mybox.show();
	}
}