class Static
{
static int a = 42;
static int b = 99;
static void callme()
{
System.out.println("a="+a);
}
}
class Staticdemo
{
public static void main(String s[])
{
Static.callme();
System.out.println("b="+Static.b);
}
}
