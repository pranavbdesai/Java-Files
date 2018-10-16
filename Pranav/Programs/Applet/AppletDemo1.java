import   java.awt.*;
import   java.applet.*;
/*
<applet code="AppletDemo1" width=500 height=300>
</applet>
*/
public class AppletDemo1 extends Applet
{
	String Msg="Helllo James BOND= COLLECTOR";
	public void init()  
	{
		setBackground(Color.orange);
		setForeground(Color.blue);
	}
	public void paint(Graphics G)
	{
		G.drawString(Msg,10,10);
	}
}