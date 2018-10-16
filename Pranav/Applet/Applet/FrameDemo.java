//Frame is A Child window of An applet.

import java.awt.*;
import java.applet.*;

public class FrameDemo extends Frame
{
	Button Submit,Reset;
	public FrameDemo()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		Submit = new Button("Submit");
		Reset = new Button("Reset");
		add(Submit);
		add(Reset);
		setVisible(true);
		setSize(300,300);
		setTitle("My Frame");	
	}
	public static void main(String ar[])
	{
		FrameDemo F = new FrameDemo();
	}
}