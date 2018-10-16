import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Colour" width=500 height=500>
</applet>
*/
public class Colour extends Applet implements ActionListener
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	Label l1,l2;
	TextField t1;
	public void init()
	{
		b1=new Button("RED_F");
		b2=new Button("GREEN_F");
		b3=new Button("BLUE_F");
		b4=new Button("YELLOW_F");
		
		b5=new Button("RED_B");
		b6=new Button("GREEN_B");
		b7=new Button("BLUE_B");
		b8=new Button("YELLOW_B");
		b9=new Button("RESET");
		l1=new Label("FORGROUND");
		l2=new Label("BACKGROUND");
		t1=new TextField(20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b5.addActionListener(this);
		b9.addActionListener(this);
		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l2);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(t1);
		add(b9);
	}
	public void actionPerformed(ActionEvent e)
	{
		String S=e.getActionCommand();
		String S1;
		System.out.println(S  +"colour is selected");
		if(S.equals("RED_B"))//b5
		{	
			t1.setBackground(Color.red);
			b1.setEnabled(false);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b2.setEnabled(true);
			b6.setEnabled(true);
		}
		if(S.equals("GREEN_B"))//b6
		{	
			t1.setBackground(Color.green);
			b1.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b2.setEnabled(false);
			b6.setEnabled(true);
		}
		if(S.equals("BLUE_B"))//b7
		{	
			t1.setBackground(Color.blue);
			b1.setEnabled(true);
			b3.setEnabled(false);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b2.setEnabled(true);
			b6.setEnabled(true);
		}
		if(S.equals("YELLOW_B"))//b8
		{	
			t1.setBackground(Color.yellow);
			b1.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(false);
			b5.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b2.setEnabled(true);
			b6.setEnabled(true);
		}
		if(S.equals("RED_F"))//b1
		{	
			t1.setForeground(Color.red);
			b2.setEnabled(true);
			b1.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b5.setEnabled(false);
		}
		if(S.equals("GREEN_F"))//b2
		{	
			t1.setForeground(Color.green);
			b5.setEnabled(true);
			b1.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b6.setEnabled(false);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b2.setEnabled(true);
		}
		if(S.equals("BLUE_F"))//b3
		{	
			t1.setForeground(Color.blue);
			b1.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b7.setEnabled(false);
			b8.setEnabled(true);
			b2.setEnabled(true);
			b6.setEnabled(true);
		}	
		if(S.equals("YELLOW_F"))//b4
		{
			t1.setForeground(Color.yellow);
			b1.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(false);
			b2.setEnabled(true);
			b6.setEnabled(true);
		}
		if(S.equals("RESET"))
		{
			t1.setText("");
			t1.setBackground(Color.white);
			t1.setForeground(Color.black);
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			
		}
	}
}