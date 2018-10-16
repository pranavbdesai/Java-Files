class Inter implements FirstInter
{
	float avg;
	public void Avg()
	{
	avg=(m1+m2)/2.0f;
	}
	public void Show()
	{
		System.out.println("\n M1  "+ m1+"\t\t M2 "+m2);
		System.out.println("\n Avg :" + avg);
	}
}
class InterDemo1 
{
	public static void main(String ar[])
	{
		Inter I = new Inter();
		I.Avg();
		I.Show();
	}
}