class Time
{
int hour;
int min;
int sec;
Time()
{
hour=0;
min=0;
sec=0;
}
Time(int h,int m,int s)
{
hour=h;
min=m;
sec=s;
}
Time sum(Time t1,Time t2)
{
Time t3=new Time();
int hr,mi,se;
t3.hour=t1.hour+t2.hour;
t3.min=t1.min+t2.min;
t3.sec=t1.sec+t2.sec;
System.out.println("HOUR:"+t3.hour);
System.out.println("MINUTES:"+t3.min);
System.out.println("SECOND:"+t3.sec);
return t3;
}
}
class Timedemo
{
public static void main(String s[])
{
Time t1=new Time(12,56,85);
Time t2=new Time(4,14,25);
Time t3=new Time();
t3.sum(t1,t2);
}
}
