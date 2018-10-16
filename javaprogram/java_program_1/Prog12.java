import java.awt.*;
import java.applet.*;
 
/* 
<applet code="Prog12" width=275 height=100>
<param name=Left value=1>
</applet>
*/
  public class Prog12 extends Applet implements Runnable
{
           int x,y,sizex;
           int left; 
           String param;
           Thread t=null;
           public void init()
                 {
                   setBackground(Color.red);
                   x=y=0;
                   sizex=Integer.parseInt(getParameter("WIDTH"));
                }
          public void start()
               {
                  t=new Thread(this);
                  t.start();
                  param=getParameter("Left");
                  left=Integer.parseInt(param);         
               }
         public void run()
              {
                while (true) 
                      {
                             try                
                                  {
                                    if (x<=(sizex-50)) x+=left;
                                    repaint();
                                    Thread.currentThread().sleep(40);
                                  }
                              catch (InterruptedException e) {};
                       }
            }
           public void paint(Graphics g)
            {
              g.setColor(Color.yellow);
              g.fillOval(x,25,50,50);
             }
}
