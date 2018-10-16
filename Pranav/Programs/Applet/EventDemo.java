import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="EventDemo" width=200 height=200></applet>
*/
public class EventDemo extends Applet implements ActionListener
{
	Button Submit,Reset;
	public void init()
	{
		Submit = new Button("Submit");
		Reset = new Button("Reset");
		add(Submit);
		add(Reset);
		Submit.addActionListener(this);
		Reset.addActionListener(this);	
		Reset.setEnabled(false);		
	}
	public void actionPerformed(ActionEvent e)
	{
		String Str = e.getActionCommand();
		System.out.println("Event is Fired" + Str);
		if(Str.equals("Submit"))
		{
			System.out.println("Submit is Pressed");
			Submit.setEnabled(false);
			Reset.setEnabled(true);
		}
		else
		{
			System.out.println("Reset is Pressed");
			Submit.setEnabled(true);
			Reset.setEnabled(false);
		}
	}
}