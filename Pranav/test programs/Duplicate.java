class Duplicate
{
public static void main(String s[])
  {
   int a[] = new int[5];
   for(int i=0;i<5;i++)
    {
    a[i]=Integer.parseInt(s[i]);
    }
       for(int i=0;i<5;i++)
       {
       int count=0;
          for(int j=0;j<5;j++)
            {
            if(a[i]==a[j])
                {
                 count++;
                }
           }
      System.out.println(+a[i]+" repeated"+" "+count+" times");
      }
  }
}