package Student;
public class Stud
{
	public int Rollno;
	public String Name;
	public void Set(int r, String N)
	{
		Rollno=r;
		Name=N;
	}
	public void Show()
	{
		System.out.println("\n\t"+Rollno +"\t\t " + Name);
	}
}
	