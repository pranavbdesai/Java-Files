class student
{
	int rollno;
	String name;
	marks M = new marks();
	public void set(int a,String b)
	{
		rollno=a;
		name=b;
	}
	public void show()
	{
		System.out.println("\n Roll no:"+rollno);
		System.out.println("\n Name:"+name);
	}
	class marks
	{
		int m1,m2,m3;
		float per;
		public void set(int a,int b,int c)
			{
				m1=a;
                     			m2=b;
				m3=c;
			}			
		public void show()
			{
				System.out.println("\n Enter marks in Maths:"+m1);
				System.out.println("\n Enter marks in Physics:"+m2);
				System.out.println("\n Enter marks in Chemistry:"+m3);
				System.out.println("\n Percentage is:"+per);
			}
		public void calc()
			{
				per=(m1+m2+m3)/3.00f;
				
				if(per>=75 && per<=100)
				{
					System.out.println("\n Grade A");
				}
				else if(per<=65 && per>55)
				{
					System.out.println("\n Grade B");
				}
				else if(per<=55 && per>45)
				{
					System.out.println("\n Grade C");
				}
				else if(per<=45 && per>=35)
				{
					System.out.println("\n Grade D");
				}
				else if(per<35)
				{
					System.out.println("\n FAIL.......!!!");
				}
				
			}	
				
		}
}
class markdemo
{
	public static void main(String ar[])
		{
			student s=new student();
			s.set(Integer.parseInt(ar[0]),ar[1]);
			s.show();
			s.M.set(Integer.parseInt(ar[2]),Integer.parseInt(ar[3]),Integer.parseInt(ar[4]));
			s.M.calc();
			s.M.show();
		}
}