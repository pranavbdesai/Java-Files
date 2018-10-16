class stack 
{
 int a[]=new int[10];
 int tos;
 stack()
	{
	 tos=-1;
	}
 void push(int k)
 {
  if(tos==9)
  {
   System.out.println("overflow");
  }
  else
  {
   a[++tos]=k;
  }
 }
 int pop()
 {
  if(tos<0)
  {
   System.out.println("underflow");
   return 0;
  }
  else
  {
   return a[tos--];
  }
 }
} 
class stackdemo
{
 public static void main(String s[])
 {
  stack s1=new stack();
  for(int i=0;i<3;i++)
  //{
  //System.out.println(" value is = " +
  s1.push(i);
  //}
  for(int i=0;i<3;i++)
  //{
  //System.out.println(" value is = " +
  s1.pop();
  //}
 }
}
