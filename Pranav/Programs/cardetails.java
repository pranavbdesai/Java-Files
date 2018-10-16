class Car
{
int modelno;
String name;
String color;
int cost;
void getcardetails(int m,String n,String c,int co)
{
modelno = m;
name = n;
color = c;
cost = co;
}
void showcardetails()
{
System.out.println("<-------CAR DETAILS------->");
System.out.println("MODEL NO:"+modelno);
System.out.println("NAME:"+name);
System.out.println("COLOR:"+color);
System.out.println("COST:"+cost);
}
}
class Cardemo
{
public static void main(String s[])
{
Car c1 = new Car();
Car c2 = new Car();
Car c3 = new Car();
c1.getcardetails(101,"alto","green",200000);
c1.showcardetails();
c2.getcardetails(102,"swift","white",350000);
c2.showcardetails();
c3.getcardetails(103,"polo","red",560000);
c3.showcardetails();
}
}
