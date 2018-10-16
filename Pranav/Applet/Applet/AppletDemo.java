import java.awt.*;
import java.applet.*;
/*<applet code="AppletDemo" width=300 height=300></applet>*/
public class AppletDemo extends Applet
{
	Font F;
	public void init()
	{
		System.out.println("\n Init Method is Called ");
		F = new Font("ARIAL",Font.PLAIN,20);
		setBackground(Color.blue);
		setForeground(Color.white);
	}
	public void start()
	{
		System.out.println("\n Start Method is Called ");
	}
	public void paint(Graphics G)
	{
		System.out.println("\n Paint Method is Called ");
		G.drawString("Misha Muchhala",10,30);
		G.setFont(F);
		G.drawString("Changa ",10,60);
		showStatus("This is a Status Bar of Applet");
	}
	public void stop()
	{
		System.out.println("\n Stop Method is Called ");
	}
	public void destroy()
	{
		System.out.println("\n Destroy Method is Called ");
	}
}