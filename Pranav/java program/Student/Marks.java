package Student.Stud;

public class Marks extends Stud
{
int  mar1;
int mar2;
int mar3;
	public Marks(int r,String n,int m1,int m2,int m3)
	{
	super(r,n);
	mar1=m1;
	mar2=m2;
	mar3=m3;	
	}
	public void display()
		{
		Show();					    System.out.println("mark1:"+mar1+"\t\t"+"mar2:"+mar2+"\t\t"+"mark3:"+mar3);
	
		}
}