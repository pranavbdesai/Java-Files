//MultiChild Threading

class NewThread extends Thread
{
	Thread T;
	public NewThread(String Msg,int P)
	{
		T=new Thread(this,"ChildThread");
		//System.out.println("Child Thread created");
		T.setName(Msg);
		T.setPriority(P);
		T.start();
	}
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("\n\t" +T.getName()+"\t"+i);
				T.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println("\n Error" +e);
		}
	}
}
class MultiThreadDemo
{
	public static void main(String arp[])
	{
		NewThread P=new NewThread("First",1);
		NewThread P1=new NewThread("Second",10);
		NewThread P2=new NewThread("Third",5);
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("\n Parent Thread \t" +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.print("\n Error" +e);
		}
	}
}