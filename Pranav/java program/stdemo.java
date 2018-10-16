class student
{
	int no;
	String name;
	int mar1;
	int mar2;
	float per;
	String grade;
		void set(int n,String na,int m1,int m2)
		{
		no=n;
		name=na;
		mar1=m1;
		mar2=m2;
		}
			void calculate()
			{            
				float c;
				c=(mar1+mar2)/2;
				per=(mar1+mar2)*0.5f;

			}
			void display()
			{
			System.out.println("Roll no. is:"+no+"\t"+"Name is:"+name+"\t"+"marks of sub1:"+mar1+"\t"+"marks of sub2:" + mar2+"\t"+"percent is:"+per);
			}
		
}
class stdemo
{
	public static void main(String ar[])
	{
	int i;
	student s1=new student();
	s1.set(67,"Nirav",30,39);
	s1.calculate();
	s1.display();
	
	i=(int)s1.per /10;
switch(i)
{
case 10:
case 9:

case 7:
System.out.println(" distinction & grade is: A");
break;

case 8:
System.out.println("grade is :A++");
break;
case 6:
System.out.println("first class & grade is:B ");
break;
case 5:
System.out.println("second grade is:C");
break;
case 4:
System.out.println("pass class"+"\t"+"the grade is:D");
break;
default:
System.out.println("faill");
break;

}
}
}