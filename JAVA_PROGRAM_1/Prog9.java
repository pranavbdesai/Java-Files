import java.awt.*; 
import java.awt.event.*; 
import java.applet.*;
/*
<applet code="Prog9" width=250 height=150
</applet>
*/
public class Prog9 extends Frame 
 { 
         Button b1,b2;
         Label l1,l2;
          public Prog9() 
                   { 
                       super("Menu System Test Window"); 
                       setSize(250, 150); 
                       l1=new Label("Source");
                       l2=new Label("Destination");
                       b1=new Button("Route Availability");
                       b2=new Button("Seat  Availability");
                       setLayout(new BorderLayout());
                       Panel p1=new Panel();
                       Panel p2=new Panel();
                       p1.setLayout(new FlowLayout());
                       p2.setLayout(new FlowLayout());
                       p1.add(l1);
                       p1.add(l2);
                       p2.add(b1);
                       p2.add(b2);
                       FileMenu fileMenu = new FileMenu(this); 
                       MenuBar mb = new MenuBar(); 
                       mb.add(fileMenu); 
                       setMenuBar(mb);
                       MyWindowAdapter adapter=new MyWindowAdapter(this);
                       addWindowListener(adapter);
                       add(p2,"South");
                       add(p1,"Center");
                     }
                class MyWindowAdapter extends WindowAdapter
                   {
                    Prog9 menuframe;
                    public MyWindowAdapter(Prog9 menuframe)
                        {
                         this.menuframe=menuframe;
                        }
                    public void windowClosing(WindowEvent we)
                       {
                         menuframe.setVisible(false);
                        }
                  }
               public static void main(String s[])
                  { 
                    Prog9 w = new Prog9(); 
                    w.setVisible(true); 
                  } 
} 
 
class FileMenu extends Menu 
 { 
             Prog9 mw;  
             public FileMenu(Prog9 m) 
              { 
               super("Reservation"); 
               mw=m;
               MenuItem mi; 
               add(mi = new MenuItem("By Rail"));   
               add(mi = new MenuItem("By Road")); 
               add(mi = new MenuItem("By Air")); 
              } 
} 
