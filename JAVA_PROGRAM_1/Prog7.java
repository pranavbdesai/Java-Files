import java.awt.*;
import java.applet.*;
 
/* 
<applet code="Prog7" width=300 height=100>
</applet>
*/
  public class Prog7 extends Applet implements Runnable
{
           int x;
           Thread t=null;
           public void init()
                 {
                   setBackground(Color.yellow);
                   x=0;
                }
          public void start()
               {
                  t=new Thread(this);
                  t.start();
               }
         public void run()
              {
                while (true) 
                      {
                             try                
                                  {
                                   if(x<=99) x+=1;
                                   repaint();
                                   Thread.currentThread().sleep(40);
                                  }
                             catch (InterruptedException e) {};
                       }
            }
           public void paint(Graphics g)
            {
              g.setColor(Color.black);
              g.drawRect(100,50,100,20);
              g.setColor(Color.red);
              g.fillRect(100,50,x,20);
              g.drawString(x+"%",100,100);
             }
}
