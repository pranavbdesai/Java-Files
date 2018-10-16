import java.awt.*;
import javax.swing.*;
/*
<applet code="JLabelDemo" width=250 height=150>
</applet>
*/
public class JLabelDemo extends JApplet 
{
	public void init() 
	{
		Container contentPane = getContentPane();
		ImageIcon ii = new ImageIcon("1.jpg");
		// Create a label
		JLabel jl = new JLabel("France", ii, JLabel.CENTER);
		// Add label to the content pane
		contentPane.add(jl);
	}
}