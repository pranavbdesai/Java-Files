import java.applet.*;
import java.awt.*;
/*
<applet code="AppletDemo" width=500 height=500>
</applet>
*/
public class AppletDemo extends Applet
{
	public void init()
	{
	setBackground(Color.black);
	setForeground(Color.red);
	System.out.println("\n Init Is Called");
	}
	public void start()
	{
	System.out.println("\n Start Is Called");
	}
	public void paint(Graphics G)
	{
	System.out.println("\n Paint Is Called");
	G.drawString("Welcome to Applet", 20,40);
	G.setColor(Color.blue);
	G.setFont(new Font("ARIAL",Font.BOLD,24));
	G.drawString("Welcome to Applet", 10,80);
	G.drawString("Welcome to Applet", 300,80);
	}
	public void stop()
	{
	System.out.println("\n Stop Is Called");
	}
	public void destroy()
	{
	System.out.println("\n Destroyed Is Called");
	}

	
}