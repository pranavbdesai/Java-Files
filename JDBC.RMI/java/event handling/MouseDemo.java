import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="MouseDemo" width=400 height=200></applet>*/

public class MouseDemo extends Applet implements MouseListener,MouseMotionListener
{
	//String msg="";
	Button submit;
	int X=0,Y=0;
	public void init()
	{
		submit = new Button("Submit Form");
		add(submit);
		submit.addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics G)
	{
		G.drawString(msg,X,Y);
	}
	public void mouseClicked(MouseEvent me)	
	{
		msg="Mouse is Clicked";
		repaint();
	}
	public void mousePressed(MouseEvent me)	
	{
		msg="Mouse is Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)	
	{
		msg="Mouse is Released";
		repaint();
	}
	public void mouseEntered(MouseEvent me)	
	{
		msg="Mouse is Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)	
	{
		msg="Mouse is Exited";
		repaint();
	}
	//-----------------------------
	public void mouseDragged(MouseEvent me)	
	{
		msg="Mouse is Dragged";
		repaint();
	}
	public void mouseMoved(MouseEvent me)	
	{
		msg="Pranav Desai";
		X =me.getX();
		Y= me.getY();
		repaint();
	}
}