//Multithreading Parent-Child

class NewThread extends Thread
{
	Thread T;
	public NewThread(String Msg)
	{
		T=new Thread(this,"ChildThread");
		System.out.println("Child Thread Exception");
		T.setName(Msg);
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
class MultiThread
{
	public static void main(String arp[])
	{
		NewThread P=new NewThread("First");
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