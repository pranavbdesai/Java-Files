import java.awt.*;
import java.applet.*;

public class FrameDemo extends Frame
{
	Button Submit;
	public FrameDemo()
	{
		setLayout(new FlowLayout());
		setTitle("My Frame");
		setSize(300,400);
		setVisible(true);
		Submit = new Button("Submit");
		add(Submit);
	}
	public static void main(String ar[])
	{
		FrameDemo FD = new FrameDemo();
	}
}