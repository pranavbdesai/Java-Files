package Student;

public class Stud
{
	public int RollNo;
	public String Name;
	public void Set(int r, String s)
	{
		RollNo=r;
		Name= s;
	}
	public void Show()
	{
		System.out.println("\n\t " +RollNo +" \t"+ Name);
	}

}