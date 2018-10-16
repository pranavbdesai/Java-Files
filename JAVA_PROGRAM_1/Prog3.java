class Prog3
{
    public static void main(String s[])
        {
        Cubby c = new Cubby();
        Packet p1 = new Packet(c);
        Charges c1 = new Charges(c);
        p1.start();
        c1.start();
        }
} 
class Cubby
 {
         int content=0;
         boolean available = false;
         String CourierQueue[]=new String[5];
         synchronized String get()
           {
        while (available == false) 
              {
                 try {
                          wait();
                       }               
                 catch (InterruptedException e) { }
              }
                available = false;
                notifyAll();
                return CourierQueue[content--] ;
          }
 
         synchronized void put(String value) 
           {
               while (available == true)   
                     {
                        try  
                         {
                           wait();
                          } 
                          catch (InterruptedException e) { }
                    }
                    CourierQueue[++content] = value;
                    available = true;
                    notifyAll();
            }
}
class Charges extends Thread
  {
        Cubby cubbyhole;
        int number;
        Charges(Cubby c)
              {
                 cubbyhole = c;
              }
        public void run()
              {
        for(int i=0;i<10;i++)
                   {
                      String s=cubbyhole.get();
                      String msg1=s.substring(0,2);
                      String msg2=s.substring(5,7);
                      System.out.println(msg1+" gm "+"packet- "+msg2+" Rs ");
                      int a=Integer.parseInt(msg1);
                      int b=Integer.parseInt(msg2);
                      int price=a*b;
                      System.out.println("Total price:"+price);
                  }
               }
    }
class Packet extends Thread
 {
        Cubby cubbyhole;
        int number;
        Packet(Cubby c)
           {
             cubbyhole = c;    
            }
       public void run()
           {
              cubbyhole.put("20gm/20Rs");
              cubbyhole.put("20gm/20Rs");
              cubbyhole.put("30gm/10Rs");
              cubbyhole.put("50gm/10Rs");
              cubbyhole.put("05gm/05Rs");
              cubbyhole.put("20gm/30Rs");             
            }
}

 
 