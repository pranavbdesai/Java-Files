import java.awt.*;
import java.applet.*;

/*<applet code="AppletDemo" width=300 height=300></applet>*/

public class AppletDemo extends Applet
{
	public void init()
	{
		System.out.println("\n In the Init Method");
		setBackground(Color.red);
		setForeground(Color.yellow);
	}	
	public void stop()
	{
		System.out.println("\n In the Stop Method");
	}	
	public void start()
	{
		System.out.println("\n In the Start Method");
	}	
	public void destroy()
	{
		System.out.println("\n In the Destroy Method");
	}	
	public void paint(Graphics G )
	{
		System.out.println("\n In the Paint Method");
		G.drawString("My Name is Pranav",10,20);
		G.setColor(Color.blue);
		G.drawString("My Name is Pranav",10,80);
		G.setColor(Color.white);
		G.setFont(new Font("ARIAL",Font.BOLD,25));
		G.drawString("My Name is Pranav",40,120);

	}	


}