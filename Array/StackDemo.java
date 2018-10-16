class Stack 
{
int a[]=new int[10];
int tos;
Stack()

{
tos=-1;
}
void push(int k)
{
if(tos==9)
{
System.out.print("OVERFLOW");
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
System.out.print("UNDERFLOW");
return 0;
}
else
{
return a[tos--];
}
}
};
class StackDemo
{
public static void main(String s[])
{
Stack s1=new Stack();
for(int i=0;i<10;i++)s1.push(i);

for(int i=9;i>0;i--)
{
 int r;
r=s1.pop();
System.out.print("ans="+r);
}

}
}

