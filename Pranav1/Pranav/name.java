class team
{
	int no;
	String name;
	public void set(int a,String b)
	{
		no=a;
		name=b;
	}
	public void show()
	{
		System.out.println("\n Enter no:"+no);
		System.out.println("\n Enter name:"+name);
	}
}
class team1 extends team
{
	int rank;
	String status;
	public void set(int a,String b,int c,String d)
	{
		super.set(a,b);
		rank=c;
		status=d;
	}
	public void show()
	{
		super.show();
		System.out.println("\n Enter rank:"+rank);
		System.out.println("\n Enter status:"+status);
	}
}
class team2 extends team1
{
	String adrs;
	 public void set(int a,String b,int c,String d,String e)
	{
		super.set(a,b,c,d);
		adrs=e;
	}
	public void show()
	{
		super.show();
	      	System.out.println("\n Address is:"+adrs);
	}
}
class name
{
	public static void main(String ar[])
	{
		team2 t=new team2();
		t.set(Integer.parseInt(ar[0]),ar[1],Integer.parseInt(ar[2]),ar[3],ar[4]);
		t.show();
	}
}