import javax.swing.*;
import java.awt.*;
public class LoginDemo extends JFrame
{
	public JButton Submit,Reset;
	public JTextField Un;
	public JPasswordField Ps;
	public LoginDemo();
	{
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		Un =new JTextField(20);
		Ps = new JPasswordField(20);
		Submit = new JButton("Submit");
		Reset= new JButton("Reset");
		add(Un);
		add(Ps);
		add(Submit);
		add(Reset);
		setSize(400,500);
		setTitle("Login in to System");
		setVisible(true);
	}
	public static void main(String arp[])
	{
		LoginDemo LD =new LoginDemo();
	}
}