import java.awt.*;
import java.applet.*;
 
/* 
<applet code="Prog14" width=300 height=100>
</applet>
*/
  public class Prog14 extends Applet implements Runnable
{
           int x,y,dx,dy,diam,sizex,sizey;
           Thread t=null;
           public void init()
                 {
                   setBackground(Color.green);
                   x=y=0;
                   dx=dy=5; 
                   diam=30;
                   sizex=Integer.parseInt(getParameter("WIDTH"));
                   sizey=Integer.parseInt(getParameter("HEIGHT"));
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
                                    x+=dx;
                                    y+=dy;
                                    if ((x<=0)||(x+dx+diam>=sizex))
                                    dx=-dx;
                                    if ((y<=0)||(y+dy+diam>=sizey)) 
                                    dy=-dy;
                                    repaint();
                                   Thread.currentThread().sleep(40);
                                  }
                             catch (InterruptedException e) {};
                       }
            }
           public void paint(Graphics g)
            {
              g.setColor(Color.yellow);
              g.fillArc(x,y,diam,diam,0,360);
             }
}
