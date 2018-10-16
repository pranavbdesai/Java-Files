class Emp1
{
double net_sal;
double HRA;
double DA;
double gross;
double gross_sal()
{
gross=net_sal+((net_sal*HRA)/100)+((net_sal*DA)/100);
return(gross);
}
Emp1()
{
net_sal=30000;
HRA=41.2;
DA=10;
}
Emp1(double m,double n,double o)
{
net_sal=m;
HRA=n;
DA=o;
}
};
class Emp1Demo
{
public static void main(String s[])
{
Emp1 e1=new Emp1();
Emp1 e2=new Emp1(20000,21.3,12);
System.out.println("GROSS_SALARY="+e1.gross_sal());
System.out.println("GROSS_SALARY="+e2.gross_sal());
}
}