class Over
{
void test()
{
System.out.print("no para");
}
void test(int a)
{
System.out.println("a:"+a);
}
void test(int a,int b)
{
System.out.println("a and b:"+a + "  "+b);
}
double test(double a)
{
System.out.println("double a:" +a);
return a*a;
}
};
class Overdemo
{
public static void main(String s[])
{
Over od=new Over();
double result;
od.test();
od.test(10);
od.test(10,20);
result=od.test(123.25);
System.out.println("Result:"+result);
}
}


