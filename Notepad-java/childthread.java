class ChildThread1 implements Runnable
{
	Thread t;
	String name;
	int a[];
	int top;
	int num;
	public ChildThread1(String m,int n)
	{
		a=new int[5];
		top=-1;
		name=m;
		num=n;
		t = new Thread(this, name);
		System.out.println("Child Thread  " +name);
		t.start();		
	}
	public void run()
	{

		try
		{
			if(top<0)
			{
				System.out.println("\n " + t.getName()+"\t" +name);	
			 	t.sleep(1000);	
			}
			else
			{
				a[++top]=num;
			}
		}
		catch(InterruptedException e)
		{
		
		}
	}
}
class mul
{
	public static void main(String arp[])
	{
		new ChildThread1("push",12);
		new ChildThread1("push",20);
		new ChildThread1("push", 5);
		
		/*try
		{
			for(int i=1;i<=5;i++)
			{
			 System.out.println("\n Parent Thread : " + i);	
			 Thread.sleep(1000);	
			}
		}
	catch(InterruptedException e)
		{
	
		}*/
	}
}