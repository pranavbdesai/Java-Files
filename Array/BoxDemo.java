class Box
{
double h,w,b;
double vol;
double volume()
{
vol=h*b*w;
return(vol);
}
Box()
{
h=b=w=10;
}
Box(double m,double n,double o)
{
h=m;
b=n;
w=o;
}
};
class BoxDemo
{
public static void main(String s[])
{
Box c=new Box(10,20,30);
Box b1=new Box();
System.out.println("Vol="+b1.volume());
System.out.println("Vol="+c.volume());
}
}
