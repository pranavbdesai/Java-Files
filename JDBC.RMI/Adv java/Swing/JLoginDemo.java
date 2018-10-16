import javax.swing.*;
import java.awt.*;
public class JLoginDemo extends JFrame
{
	public JButton Submit,Reset;
	public JTextField Un;
	public JPasswordField Ps;
	public JPanel P1,P2;
	public JLoginDemo()
	{
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		Un =new JTextField(20);
		Ps = new JPasswordField(20);
		Submit = new JButton("Submit");
		Reset= new JButton("Reset");
		P1 = new JPanel();
		P2 = new JPanel();

		P1.add(Un);
		P1.add(Ps);
		P2.add(Submit);
		P2.add(Reset);
		add(P1);
		add(P2);
		setSize(300,500);
		setTitle("Login in to System");
		setVisible(true);
	}
	public static void main(String arp[])
	{
		JLoginDemo LD =new JLoginDemo();
	}
}