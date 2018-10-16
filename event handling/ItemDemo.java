import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="ItemDemo" width=300 height=300></applet>*/

public class ItemDemo extends Applet implements ItemListener
{
	Choice City;
	String msg="";
	public void init()
	{
		City = new Choice();
		City.add("ANAND");
		City.add("Madras");
		City.add("Vadodara");
		City.add("Banlgore");
		City.addItemListener(this); // registering Component
		add(City);
	}
	public void itemStateChanged(ItemEvent ie)
	{
	System.out.println("City : " + City.getSelectedItem());
	msg = "City : " + City.getSelectedItem();
	repaint();
	}
		public void paint(Graphics G)
		{
		showStatus(msg);
		G.drawLine(20,75,200,175);
		G.drawOval(50,10,200,90);
		G.setColor(Color.pink);
		G.fillOval(40,40,250,80);
	}
}