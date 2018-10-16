class Day
{
public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
int m = Integer.parseInt(args[1]);
int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
int sum = 0;
for(int i=0;i<m-1;i++)
{
sum+=month[i];
}
sum=sum+n;
System.out.println(+sum+" "+"DAYS OF YEAR");
}
}

