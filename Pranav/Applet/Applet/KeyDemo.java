/*
	KeyListener
		keyPressed()
		keyTyped()
		keyReleased()
*/
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="KeyDemo" width=250 height=300>
</applet>*/
public class KeyDemo extends Applet implements KeyListener
{
	TextField tf;
	TextArea con;
	public void init()
	{
		tf = new TextField(20);
		con = new TextArea(5,20);
		tf.addKeyListener(this);	
		add(con);
		add(tf);
		tf.requestFocus();
	}
	public void keyPressed(KeyEvent ke)
	{
		int c = ke.getKeyCode();
		//System.out.println("Presed " + c);
		if(c==KeyEvent.VK_ENTER)
		{
			con.append(tf.getText()+"\n");
			tf.setText("");
			tf.requestFocus();
		}
		else if(c==KeyEvent.VK_F1)
		{
			showStatus("You Required Help on this Topic");
		}

	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
	}
}
