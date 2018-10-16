import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Login extends Frame implements ActionListener
{
	TextField TUn,TPs;
	Label LUn,LPs;
	Button Submit,Reset;
	public Login()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		TUn=new TextField(20);
		TPs=new TextField(20);
		TPs.setEchoChar('*');
		LPs=new Label("Password");
		LUn=new Label("User name");
		Submit=new Button("Submit");
		Reset=new Button("Reset");
		Submit.addActionListener(this);
		Reset.addActionListener(this);
		add(LUn);
		add(TUn);
		add(LPs);
		add(TPs);
		add(Submit);
		add(Reset);
		Reset.setEnabled(false);
		setSize(300,300);
		setTitle("Login Dialog");
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		System.out.println(s+"Button is Pressed");
		if(s.equals("Submit"))
		{	
			Submit.setEnabled(false);
			Reset.setEnabled(true);
			if(TUn.getText().equals("Jaimini"))
			{
				NotePad N=new NotePad();
				dispose();
			}
			else
			{
				System.out.println("User Name::"+TUn.getText()+"\t 				Password::"+TPs.getText());
			}
		}
		else
		{
			TUn.setText("");
			TPs.setText("");
			Submit.setEnabled(true);
			Reset.setEnabled(false);
		}
	}
	public static void main(String a[])
	{
		Login L=new Login();
	}
}
		