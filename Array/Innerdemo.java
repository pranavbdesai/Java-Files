class Outer 
{
int x=100;
 void test()
 {
  Inner inner=new Inner();
  inner.display();
 }
       class Inner 
             {
              void display()
                          {
                           System.out.print("x="+x);
                           }
              }
}
class Innerdemo
{
public static void main(String s[])
{
Outer o=new Outer();
o.test();
}
}
