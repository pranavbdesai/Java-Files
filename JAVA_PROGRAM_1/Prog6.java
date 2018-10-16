import java.io.*;
class Prog6
{
       public static void main(String a[])
          {
            String dirname="/java";
            File f1=new File(dirname);
            FilenameFilter only=new OnlyExt("txt");
            String s[]=f1.list(only);
                 for(int i=0;i<s.length;i++)
                {
                   System.out.println(s[i]);
                }
           }
}