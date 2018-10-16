class square
{
	int height;
	int width;
	int sa;
		square(int h,int w)
		{
		height=h;
		width=w;
		
		}
			void comp_sa(int h,int w)
			{
			sa=h*w;
		
			}
				void display()
				{
	                                         System.out.println("the value:"+"\t\t"+height+"\t\t"+width);
				System.out.println("the sa of square::"+"\t\t"+sa);
				}
}
class cube extends square
{
	int depth;
	int sac;
		cube(int he,int wi,int d)
		{
		super(he,wi);
		depth=d;
		System.out.println("the depth:"+depth);
		}
	
			void comp_sa(int he,int wi,int d)
			{
			comp_sa(he,wi);	
			sac=he*wi*d;
			System.out.println("the sa of cube is::"+"\t\t"+sac);
			display();
			}
	
	
	
}
class vs
{
	public static void main(String s[])
	{
	cube c1=new cube(10,11,12);
	c1.comp_sa(10,11,12);
	
	}	
}