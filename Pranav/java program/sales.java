class Sales
{
String name;
int sales;
Sales(String n,int sa)
{
name=n;
sales=sa;
}
void display()
{
System.out.println("NAME:"+name);
System.out.println("SALES:"+sales);
}
void comm()
{
double com;
if(sales<=25000)
{
com=5;
System.out.println("COMM:"+com);
}
else
{
com=(10*sales)/1000;
System.out.println("COMM:"+com);
}
}
};
class Salesdemo
{
public static void main(String s[])
{
Sales x=new Sales("Pranav",65000);
x.display();
x.comm();
}
