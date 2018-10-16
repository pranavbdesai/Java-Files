/*
	MouseMotionListener
		mouseMoved()
		mouseDragged()
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Write an applet program to handle mouse event that will display a message “JAVA” on mouse motion with (x,y) position of pointer
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Assign46" width=300 height=300></applet>*/
public class Assign46 extends Applet implements MouseMotionListener
{
	String Msg="Java Programming Language";
	int X=0,Y=0;
	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent me)
	{
		X = me.getX();
		Y =me.getY();
		Msg="Java Language : Mouse Moved";
		repaint(); // Call Paint Method  again	
	}
	public void mouseDragged(MouseEvent me)
	{
		X = me.getX();
		Y =me.getY();
		Msg="Mouse is Dragged";
		repaint(); // Call Paint Method  again
	}
	public void paint(Graphics G)
	{
		G.drawString(Msg,X,Y);
	}
}
