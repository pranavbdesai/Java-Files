class InterImpl implements MyInter
{
	public void Show()
	{
		System.out.println("\n In Implement");
	}
	public void ShowPi()
	{
		System.out.println("\nValue of Pi:"+pi);
	}
}
class InterDemo
{
	public static void main(String[] ar)
	{
		InterImpl I=new InterImpl();
		I.Show();
		I.ShowPi();
	}
}