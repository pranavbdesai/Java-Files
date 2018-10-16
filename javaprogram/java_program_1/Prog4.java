class NotValidYearException extends Exception
{
           public String toString()
             {
               return "WRONG YEAR ENTRY";
             }
}
class NotValidDisciplineException extends Exception
{
           public String toString()
           {
              return "WRONG DISCIPLINE ENTRY";
           }
}
class Prog4
{
         public static void main(String s[])
           {
            String id=s[0];
            String y=id.substring(0,2);
            String d=id.substring(2,4);
            String r=id.substring(4,6);
            int yr=Integer.parseInt(y);
            int roll=Integer.parseInt(r);
            try
                 {
                   if(yr<0||yr>12) throw new NotValidYearException();
                 }
           catch(NotValidYearException e)
                {
                 System.out.println(e);
                }
          try
                {
                  if(d.equals("it")||d.equals("cp")) 
                    {
                      System.out.println("CORRECT DISCIPLINE ENTRY");
                     }
                 else throw new NotValidDisciplineException();
                }
          catch(NotValidDisciplineException e)
               {
                System.out.println(e);
               }
           try
              {
               if(roll<0||roll>99) throw new ArithmeticException();
               }
            catch(ArithmeticException e)
              {
               System.out.println(e);
               }
         }
}
