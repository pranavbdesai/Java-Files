import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="mousemotiondemo" width=400 height=200></applet>*/
public class mousemotiondemo extends Applet implements MouseMotionListener
{
	String msg="nirav";
	int X,Y;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void paint(Graphics G)
	{
		G.drawString(msg,X,Y);
	}
	
	public void mouseDragged(MouseEvent me)	
	{	
	}
	public void mouseMoved(MouseEvent me)	
	{	
		X = me.getX();
		Y = me.getY();
		repaint();
	}
}