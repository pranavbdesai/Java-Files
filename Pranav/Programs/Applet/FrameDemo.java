//Frame is A Child Window of Applet

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class FrameDemo extends Frame  implements ActionListener
{
	Label Info;
	Button Submit,Reset;
	public FrameDemo()
	{
		
		Submit = new Button("Submit");
		Info = new Label("This Notepad is Created By MUKESH SHAH\n ANAND");
		setTitle("My Frame ");
		setSize(600,200);
	setLayout(new FlowLayout(FlowLayout.CENTER));
		setVisible(true);
		add(Info);
		Info.setFont(new Font("ARIAL",Font.BOLD,30));
		Info.setForeground(Color.red);
		add(Submit);
		Submit.addActionListener(this);
	}
	public static void main(String ar[])
	{
		FrameDemo F = new FrameDemo();
	}
	public void actionPerformed(ActionEvent E)
	{
		dispose();
	}
}