import Student.Stud;

class PackDemo
{
	public static void main(String arp[])
	{
		Stud S  = new Stud();
		S.Set(Integer.parseInt(arp[0]),arp[1]);
		S.Show();
	}
}		