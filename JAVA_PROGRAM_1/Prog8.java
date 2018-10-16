import java.io.*;
import java.util.Stack;
class Prog8
{
            public static void main(String s[])throws IOException
               {
                  DataInputStream k=new DataInputStream(System.in);
                  Stack r=new Stack();
                  for(int i=1; i<=5; i++)  
                      {
                        System.out.print(" ");
                        System.out.print("Enter a value to PUSH: ");
                        String x=k.readLine();
                        r.push (new String(x));
                        System.out.print("Stacked: "+r+"\n");
                      }
                   System.out.println("STACK IS FULL!");
               do
                 {
                  for(int i=1; i<=5; i++) 
                   {
                     System.out.print(" ");
                     System.out.print("Enter a value to POP: ");
                     String x=k.readLine();
                     r.pop();
                     System.out.print("Stacked: "+r+"\n");
                   }
                }while(!r.empty());
               System.out.println("STACK IS EMPTY!");
             }
}
