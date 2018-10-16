class Bankaccount
{
String name;
int accno;
String acctype;
int bal;
void create_account(String n,int ano,String atype,int b)
{
name = n;
accno =ano;
acctype = atype;
bal = b;
}
void deposit(int d)
{
bal = bal + d;
System.out.println("current balance after deposit:"+bal);
}
void withdraw(int d)
{
bal = bal - d;
System.out.println("current balance after withdraw:"+bal);
}
void balinquiry()
{
System.out.println("current balance:"+bal);
}
}
class Bank
{ 
public static void main(String s[])
{
Bankaccount b=new Bankaccount();
b.create_account("Pranav",1,"saving",12000);
b.deposit(1000);
b.withdraw(5000);
b.balinquiry();
}
}
