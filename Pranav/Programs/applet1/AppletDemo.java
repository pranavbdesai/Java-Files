import java.awt.*;
import java.applet.*;

/*<applet code="AppletDemo" Width=200 height=200></applet>*/

public class AppletDemo extends Applet
{
	public void init()
	{
		System.out.println("Init Method");
	}
	public void start()
	{
		System.out.println("Start Method");
	}
	public void paint(Graphics G)
	{
		System.out.println("Paint Method");
	}
	public void stop()
	{
		System.out.println("Stop Method");
	}
	public void destroy()
	{
		System.out.println("Destroy Method");
	}
}