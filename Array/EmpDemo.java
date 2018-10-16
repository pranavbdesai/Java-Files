class Emp
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
Emp()
{
net_sal=30000;
HRA=41.2;
DA=10;
}
};
class EmpDemo
{
public static void main(String s[])
{
Emp e1=new Emp();
System.out.println("GROSS_SALARY="+e1.gross_sal());
}
}