class Area 
{
double a;
double b;
Area(double m,double n)
{
m=a;
n=b;
}
double calarea(double a,double b)
{
return (a*b);
}
double calarea(int a,double b)
{
return (a*b*0.5);
}
};
class AreaDemo
{
public static void main(String s[])
{
Area r=new Area(12.5,10.5);
System.out.print("area="+r.calarea());
}
}