import java.io.*;

class ChildThread1 implements Runnable
{
	Thread t;
	String name;
	int a[];
	int top;
	int num;
	public ChildThread1(String m)
	{
		a=new int[15];
		top=-1;
		name=m;
		
		t = new Thread(this, name);
		System.out.println("Child Thread  " +name+" "+num);
		t.start();		
	}
	public void run()
	{

		try
		{
			if(top<=5)
			{
			BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
			for(int i=0;i<20;i++)
			{
			try
			{
			top++;
			a[top]=Integer.parseInt(Br.readLine());
			
			}
			catch(Exception e)
			{
			System.exit(1);
			}
			}
		
			}
			else
			{
				System.out.println("\n " + t.getName()+"\t" +name);	
			 	t.sleep(1000);
				
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
		try
		{
		
		new ChildThread1("push");
		}
		catch(Exception e)
		{
		
		}
		
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