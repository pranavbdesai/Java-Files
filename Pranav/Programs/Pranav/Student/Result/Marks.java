package Student.Result;

import Student.Stud;

public class Marks extends Stud
{
	int m1,m2;
	String Grade;
	public void SetMarks(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
	public void Calc()
	{
		float per = (m1+m2)/2.0f;
		if(per>=75)
			Grade="A";
		else if(per>=65 && per<75)
			Grade="B";
		else if(per>=55 && per<65)
			Grade="C";
		else if(per>=35 && per<55)
			Grade="Pass";
		else
			Grade="Fail";
	}
	public void ShowRes()
	{
		System.out.println("\n " + m1 + "\t" + m2 + "\t Grade : " + Grade);
	}
}	