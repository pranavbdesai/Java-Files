class Student
{
String name;
int rollno;
int mark1,mark2,mark3,mark4,mark5;
void getinfo(String n,int r,int m1,int m2,int m3,int m4,int m5)
{
name = n;
rollno = r;
mark1 = m1;
mark2 = m2;
mark3 = m3;
mark4 = m4;
mark5 = m5;
}
void putinfo()
{
System.out.println("NAME:"+name);
System.out.println("ROLLNO:"+rollno);
System.out.println("MARK1:"+mark1);
System.out.println("MARK2:"+mark2);
System.out.println("MARK3:"+mark3);
System.out.println("MARK4:"+mark4);
System.out.println("MARK5:"+mark5);
}


float calCPI()
{
float p;
if(mark1<=35||mark2<=35||mark3<=35||mark4<=35||mark5<=35)
{
System.out.println("FAILED AND CPI CAN'T BE CALCULATED");
return 0;
}
else
{
System.out.println("PASSED");
p=(((mark1+mark2+mark3+mark4+mark5)/(5))/10);
return p;
}
}
}
class Studentdemo
{
public static void main(String s[])
{
Student s1 = new Student();
Student s2 = new Student();
s1.getinfo("Pranav",65,56,67,89,78,90);
s1.putinfo();
System.out.println("CPI:"+s1.calCPI());
s2.getinfo("joe",56,30,67,89,78,90);
s2.putinfo();
System.out.println("CPI:"+s2.calCPI());
}
}
