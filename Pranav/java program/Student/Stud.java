package Student;

public class Stud 
{
	public int RollNo;
	public String Name;
	Stud(int r, String s)
	{
		RollNo=r;
		Name = s;
	}
	public void Show()
	{
	System.out.println("\n\n"+ RollNo + "\t\t"+ Name);
	}
}

