/*
	ItemListener
		itemStateChanged()

Write an applet program to display three checkboxes labeled Red, Green and Blue. Depending on the state of checkboxes background should change its color.
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Assign50" width=300 height=300></applet>*/

public class Assign50 extends Applet implements ItemListener
{
	Checkbox Red,Green,Blue;
	Panel P1;
	public void init()
	{
		P1 = new Panel();
		Red = new Checkbox("Red");
		Green = new Checkbox("Green");
		Blue  = new Checkbox("Blue");
		P1.add(new Label("Select Color"));
		P1.add(Red);	
		P1.add(Green);
		P1.add(Blue);
		Red.addItemListener(this);
		Green.addItemListener(this);
		Blue.addItemListener(this);
		add(P1);
	} 
	public void itemStateChanged(ItemEvent ie)
	{
		if(Red.getState()==true)
		{
		setBackground(Color.red);
		}
		else if(Green.getState()==true)
		{
			setBackground(Color.green);
		}
		else if(Blue.getState()==true)
		{
			setBackground(Color.blue);
		}
		else
		{
			setBackground(Color.white);
		}
	}
}