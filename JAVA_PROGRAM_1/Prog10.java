import java.io.*;

public class Prog10
 {
   public static final int max = 65535;
   public static void main(String s[]) 
{
       int c;
       long total;
       int counts[];
       if (s.length == 0)
       {
           System.out.println("Please write filename in command-line");
           System.exit(0);
       }
       counts = new int[max+1];
       total = 0;
       try 
      {
           FileReader f=new FileReader(s[0]);
           for(total = 0;(c = f.read()) != -1; total++) 
           {
               if (c <=max) counts[c] += 1;
           }
           f.close();
       }
       catch (IOException e) 
      {
           System.out.println("I/O Error: " + e);
           System.exit(1);
       }
       for(c = 0; c <= max; c++) 
       {
           if (counts[c] > 0 &&Character.isLetterOrDigit((char)c))
               {
                   System.out.println(" " + (char)c + " " + counts[c]);
               }
       }
       System.out.println("Total chars read: " + total);
   }    
}
