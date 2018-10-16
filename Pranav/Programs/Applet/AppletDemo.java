import   java.awt.*;
import   java.applet.*;
/*
<applet code="AppletDemo" width=500 height=300>
</applet>
*/
public class AppletDemo extends Applet
{
	public void init()  
	{
		System.out.println("Init is Call");
		setBackground(Color.pink);
		setForeground(Color.blue);
	}
	public void start()
	{
		System.out.println("Start is Call");
	}
	public void stop()
	{
		System.out.println("Stop is Call");
	}
	public void destroy()
	{
		System.out.println("Destroy is Call");
	}
	public void paint(Graphics G)
	{
	System.out.println("Paint is Call");	
	G.setFont(new Font("ARIAL",Font.BOLD,25));
	G.drawString("Welcome to World of Applet",10,50);
	G.setColor(Color.red);
	G.drawString("Welcome to World of Applet",15,80);
	showStatus("My Applet is Running - BEST");
	}
}