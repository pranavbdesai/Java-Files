import java.awt.*;
import java.applet.*;

public class FrameDemo extends Frame
{
	Button Submit,Reset;
	public FrameDemo()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(200,300);
		setTitle("MY FRAME");
		setVisible(true);
		Submit=new Button("Submit");
		Reset=new Button("Reset");
		add(Submit);
		add(Reset);
	}
	public static void main(String ar[])
	{
		FrameDemo F=new FrameDemo();
	}
}
		