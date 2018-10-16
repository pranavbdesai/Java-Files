/*
	Student
		rollNO
		Name
		M1
		M2
		Per
		Grade
*/
class public Student_1
{
                   public int  Roll_no;
                   public String Name;
                   public int marks1;
                   public int marks2;
                   float per;
                   void Get()
                   {
                                Roll no=24;
                                Name="Pranav";
                                Marks1=65;
                                Marks2=70;
                                per=75.25;
                     }
class StudentDemo
{
                  public static  void main(String args[]);
                  {
                            Student S=new Student();
                            Student S1=new Student();
                            S.Get();
                            S.show();
                  }
} 