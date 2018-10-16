class student
{
 double no;
 char name;
 float marks;
  void getinfo()
  {
   System.out.println("pl. enter roll no"+no);
   System.out.println("pl. enter name"+name);
  }
  void putinfo()
  {
   double marks[]=new double[5];
   System.out.println("Roll no is"+no+"Name is"+name+"marks are"+marks[5]);
  }
  float calcpi()
  {
   float c;
   c=marks/30.00f;
   System.out.println("your CPI is"+c);
  }
}
class stddemo
{
 public static void main(String s[])
 {
  student s1=new student();
  s1.getinfo();
  s1.putinfo();
  s1.calcpi();
 }
}
  
   
 	
   
 