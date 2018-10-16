class Bo
{
double h,w,b;
double vol;
double volume()
{
vol=h*b*w;
return(vol);
}
Bo()
{
h=b=w=10;
}
Bo(double m,double n,double o)
{
h=m;
b=n;
w=o;
}
};
class BoDemo
{
public static void main(String s[])
{
Bo c=new Bo(10.5,20.5,30.5);
Bo b1=new Bo(10,33.5,22.5);
System.out.println("Vol="+b1.volume());
System.out.println("Vol="+c.volume());
}
}
