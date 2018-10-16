Class Student
{
	String rollnum1,name1,grade1,rollnum2,name2,grade2;
	int n1,n2;
	public void input()
	{
		n1=1;
		n2=2;
		name1="Pranav";
		name2="Desai";
		grade1="A";
		grade2="B";
		rollnum1="07ITM45";
		rollnum2="07ITM46";
	}
	public void output()
	{
		System.out.println("\n"+n1+"\t"+name1+"\t"+rollnum1+"\t"+grade1);
		System.out.println("\n"+n2+"\t"+name2+"\t"+rollnum2+"\t"+grade2);
	}
}
Class Stu
{
	public static void main(String ar[])
	{
		Student S=new Student();
		S.input();
		S.output();
	}
}