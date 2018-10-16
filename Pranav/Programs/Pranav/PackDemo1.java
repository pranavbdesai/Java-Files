import Student.Result.Marks;

class PackDemo1

{
	public static void main(String arp[])
	{
		Marks S  = new Marks();
		S.Set(Integer.parseInt(arp[0]),arp[1]);
		S.SetMarks(Integer.parseInt(arp[2]),Integer.parseInt(arp[3]));
		S.Show();	
		S.Calc();
		S.ShowRes();
	}
}		