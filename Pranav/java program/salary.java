class Emp
{
double net_sal;
String name;
double DA;
double gross;
double gross_sal()
{
gross=net_sal+(net_sal*DA)/100;
return(gross);
}
Emp(double net,String n,double d)
{
net_sal=net;
name=n;
DA=d;
}
double tds()
{
if(gross<100000)
{
gross=gross+0;
return gross;
}
else
{
gross=gross-((gross*10)/100);
return gross;
}
}
}
class Emptds
{
public static void main(String s[])
{
Emp e1=new Emp(230008,"Pranav",74);
System.out.println("NAME="+e1.name);
System.out.println("GROSS SALARY="+e1.gross_sal());
System.out.println("GROSS SALARY AFTER TDS="+e1.tds());
System.out.println("BASIC SALARY="+e1.net_sal);
System.out.println("DEARNESS ALLOWANCE="="+e1.DA);
}
}
