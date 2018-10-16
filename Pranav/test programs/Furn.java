class Furniture
{
void use()
{
System.out.println("Furniture!!");
}
}
class Chair extends Furniture
{
void use()
{
System.out.println("Chair!!");
}
}
class Table extends Furniture
{
void use()
{
System.out.println("Table!!");
}
}
class Furn
{
public static void main(String s[])
{
Furniture f=new Furniture();
Chair c=new Chair();
Table t=new Table();
Furniture ref;
ref=c;
ref.use();
ref=t;
ref.use();
}
}
