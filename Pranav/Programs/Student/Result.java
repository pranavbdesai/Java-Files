package Student;
public class Result extends Stud implements Subject
{
	public int m1,m2,m3;
	private float per;
	public void Calculate()
	{
		m1=78;
		m2=85;
		m3=96;
		per = (m1+m2+m3)/3.0f;	
	}
	public void ShowPer()
	{
		System.out.println(Sub1 +" : " + m1);
		System.out.println(Sub2 +" : " + m2);
		System.out.println(Sub3 +" : " + m3);
	System.out.println(Name +" Get " + per );
	}
}