class A
{
int i,j;
void showij()
{
System.out.println("i and j:" +i +" "+j);
}
}
class B extends A
{
int k;
void showk()
{
System.out.println("k:" +k);
}
void sum()
{
System.out.println("i+j+k:" +(i+j+k));
}
}
class Inherit
{
public static void main(String s[])
{
A oa=new A();
B ob=new B();
oa.i=10;
oa.j=20;
oa.showij();
ob.i=7;
ob.j=8;
ob.k=9;
ob.showk();
ob.showij();
ob.sum();
}
}