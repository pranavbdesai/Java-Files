class Complex
{
double r,i;
Complex()
{
r=1.0;
i=-1.0;
}
Complex(double c,double d)
{
r=c;
i=d;
}
void add(double c1,double c2)
{
double w1,w2;
w1=r+r;
w2=i+i;
System.out.println(+w1+"i"+w2);
}
};
class Complexdemo
{
public static void main(String s[])
{
Complex c3=new Complex();
Complex c1=new Complex(5.0,4.0);
Complex c2=new Complex(8.0,9.0);
add(c1,c2);
}
}
