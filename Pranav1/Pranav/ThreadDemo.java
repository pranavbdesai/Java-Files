class ThreadDemo
{
	public static void main(String ar[])
	{
		Thread T=Thread.currentThread();
		System.out.print(" "+T);
		T.setName("My Thread");
		System.out.println("\n Thread:" +T);
		T.setPriority(Thread.MAX_PRIORITY);
		System.out.println("\n Thread:" +T);
		System.out.println("\n Name:" +T.getName());
		System.out.println("\n Priority:" +T.getPriority());
		System.out.println("\n is Alive:" +T.isAlive());
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("\n\t" +i);
				T.sleep(1000*i);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("\n Error" +e);
		}
	}
}