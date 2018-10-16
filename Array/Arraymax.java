class Arraymax
{
public static void main(String s[])
{
int max=0;
int a[]=new int[10];
int n=Integer.parseInt(s[0]);
for(int i=1;i<=n;i++)
{
a[i-1]=Integer.parseInt(s[i]);
if(a[i-1]>max)
{
max=a[i-1];
}
}
System.out.print("Max is = "+max);
}
}