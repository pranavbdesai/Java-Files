import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="MouseDemo" width=400 height=200></applet>*/
public class MouseDemo extends Applet implements MouseListener,MouseMotionListener
{
	String msg="";
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
		G.drawString(msg,10,100);
	}
	public void mouseClicked(MouseEvent me)	
	{	submit.setBackground(Color.red);
		msg="Mouse is Clicked";
		repaint();
	}
	public void mousePressed(MouseEvent me)	
	{	submit.setBackground(Color.pink);
		msg="Mouse is Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)	
	{	submit.setBackground(Color.yellow);
		msg="Mouse is Released";
		repaint();
	}
	public void mouseEntered(MouseEvent me)	
	{	submit.setBackground(Color.blue);
		msg="Mouse is Entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)	
	{	submit.setBackground(Color.gray);
		msg="Mouse is Exited";
		repaint();
	}
	//-----------------------------
	public void mouseDragged(MouseEvent me)	
	{	submit.setBackground(Color.gray);
		msg="Mouse is Dragged";
		repaint();
	}
	public void mouseMoved(MouseEvent me)	
	{	submit.setBackground(Color.gray);
		X = me.getX();
		Y = me.getY();
msg="Mouse is Moved. X " + me.getX() +" Y :" + me.getY();
		repaint();
	}
}