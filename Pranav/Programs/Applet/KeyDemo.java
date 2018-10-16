import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code="KeyDemo" width=200 height=200></applet>
*/
public class KeyDemo extends Applet implements KeyListener,ActionListener
{
	TextField tf;
	TextArea con;
	Button Submit;
	public void init()
	{
		tf = new TextField(20);
		con = new TextArea(5,20);
		Submit = new Button("Submit");
		tf.addKeyListener(this);
		Submit.addActionListener(this);
		add(con);
		add(tf);
		add(Submit);
	}
	public void keyPressed(KeyEvent ke)
	{
		int c = ke.getKeyCode();
		//System.out.println(c);
		if(c==KeyEvent.VK_ENTER)
		{
		 con.append( tf.getText()+"\n");
		 tf.setText("");
		}
	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
	}
	public void actionPerformed(ActionEvent e)
	{
		con.append( tf.getText()+"\n");
		 tf.setText("");	
	}
}