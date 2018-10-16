import Student.Result;

class PackDemo1
{
	public static void main(String ar[])
	{
		Result S = new Result(); 			
		S.Set(Integer.parseInt(ar[0]),ar[1]);
		S.SetPer(Float.parseFloat(ar[2]));
		S.Show();
		S.ShowPer();
	}
}