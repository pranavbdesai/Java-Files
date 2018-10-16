import java.awt.*;
import java.applet.*;

/*<applet code="Applet1Demo" Width=200 height=200></applet>*/

public class Applet1Demo extends Applet
{
	public void init()
	{
		setBackground(Color.red);
	}
	public void paint(Graphics G)
	{
		G.drawString("Welcome to Applet",10,20);
	}	
}