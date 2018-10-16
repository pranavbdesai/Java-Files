import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* 
<applet code="Prog2" width=300 height=200>
</applet>
*/
public class Prog2 extends Applet implements ActionListener,ItemListener
     {
           Checkbox Red,Green,Blue;
           CheckboxGroup cbg;
           Button fill;
           int a,b,c;
           public void init()
              {
                setBackground(Color.yellow);
                Red = new Checkbox("RED");
                Green = new Checkbox("GREEN");
                Blue = new Checkbox("BLUE");
                fill = new Button("FILL");
                add(Red);
                add(Green);
                add(Blue);
                add(fill);
                Red.addItemListener(this);
                Green.addItemListener(this);
                Blue.addItemListener(this);
               fill.addActionListener(this);
             }
          public void itemStateChanged(ItemEvent ie)
             {
               repaint();
              }
          public void actionPerformed(ActionEvent ae)
             {
                String str=ae.getActionCommand();
                 if(str.equals("FILL"));
                      {
                             if(Red.getState()==true)
                               {
                                 a=255;b=0;c=0;
                               }
                             if(Green.getState()==true)
                              {
                                 a=0;b=255;c=0;
                               }
                             if(Blue.getState()==true)
                             {
                                a=0;b=0;c=255;
                              }
                             if(Blue.getState()==true&Red.getState()==true)
                             { 
                                a=100;b=0;c=100;
                             }
                            if(Blue.getState()==true&Green.getState()==true)
                             {
                              a=0;b=100;c=100;
                              }
                            if(Red.getState()==true&Green.getState()==true)
                             {
                               a=100;b=100;c=0;
                             }
                            if(Red.getState()==true&Green.getState()==true&Blue.getState()==true)
                             {
                               a=100;b=100;c=100;
                             }
                      }
                       repaint();
                }
              public void paint(Graphics g)
              {
                 Color w=new Color(a,b,c);
                 g.setColor(w);
                 g.drawRect(70,90,140,100);
                 g.fillRect(70,90,140,100);
               }
}


