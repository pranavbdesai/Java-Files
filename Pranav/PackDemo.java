import Student.Stud;

class PackDemo
{
	public static void main(String ar[])
	{
		Stud S = new Stud();
		S.Set(Integer.parseInt(ar[0]),ar[1]);
		S.Show();
	}
}