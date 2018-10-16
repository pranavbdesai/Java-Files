import Student.marks;

class mrk
{
	public static void main(String ar[])
	{
		marks m=new marks();
		m.set(Integer.parseInt(ar[0]),ar[1],Integer.parseInt(ar[2]),Integer.parseInt(ar[3]),Integer.parseInt(ar[4]));
		m.show();
	}
}