
class InterD implements MyInter1
{
	public void Show()
	{
	System.out.println("Hello in Show");
	}
	public void Print()
	{
		System.out.println("Value of Pi " + pi);
	}
}
class InterDemo
{
	public static void main(String arp[])
	{
		InterD I = new InterD();
		I.Print();
		I.Show();
	}
}