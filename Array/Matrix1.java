class Matrix1 {
public static void main(String s[])
{
 int a[][] =new int[3][3];
 int col,row,i=0,sum=0;
 for(col=0;col<3;col++)
 {
  for(row=0;row<3;row++)
  {
   
   a[col][row]=Integer.parseInt(s[i++]);
  }
 }

 System.out.println("Sum for given column");
 for(col=0;col<3;col++)
 {
  for(row=0;row<3;row++)
  {
   if(col == 0)
    sum=a[col][row]+sum;   
  }
 }
 
 System.out.println("Sum for row 0="+sum);
 
 sum=0;
 for(col=0;col<3;col++)
 {
  for(row=0;row<3;row++)
  {
   if(col == 1)
    sum=a[col][row]+sum;   
  }
 }
 
 System.out.println("Sum for row 1="+sum);
 sum=0;
 for(col=0;col<3;col++)
 {
  for(row=0;row<3;row++)
  {
   if(col == 2)
    sum=a[col][row]+sum;   
  }
 }
 
 System.out.println("Sum for row 3="+sum);
 sum=0;
 System.out.println("Sum for given rows");
 for(col=0;col<3;col++)
 {
  for(row=0;row<3;row++)
  {
   if(row == 0)
    sum=a[col][row]+sum;   
  }
 }
 
 System.out.println("Sum for row 0="+sum);
 
 sum=0;
 for(col=0;col<3;col++)
 {
  for(row=0;row<3;row++)
  {
   if(row == 1)
    sum=a[col][row]+sum;   
  }
 }
 
 System.out.println("Sum for row 1="+sum);
 sum=0;
 for(col=0;col<3;col++)
 {
  for(row=0;row<3;row++)
  {
   if(row == 2)
    sum=a[col][row]+sum;   
  }
 }
 
 System.out.println("Sum for row 3="+sum);
 
}
}  

