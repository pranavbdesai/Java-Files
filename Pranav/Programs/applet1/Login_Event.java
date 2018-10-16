import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Login_Event extends Frame implements ActionListener
{
	TextField TUn,TPs,TCs;
	Label LUn,LPs,LCs;
	Button Login,Reset;
	public Login_Event()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
	
		TUn=new TextField(20);
		TPs=new TextField(20);
		TCs=new TextField(20);

		TPs.setEchoChar('*');
		TCs.setEchoChar('*');

		LUn=new Label("User name");
		LPs=new Label("Password");
		LCs=new Label("Confirm Password");

		Login=new Button("Login");
		Reset=new Button("Reset");
		Login.addActionListener(this);
		Reset.addActionListener(this);

		add(LUn);
		add(TUn);
		add(LPs);
		add(TPs);
		add(LCs);
		add(TCs);
		
		add(Login);
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
		if(s.equals("Login"))
		{	
			Login.setEnabled(false);
			Reset.setEnabled(true);
			//char j[]=TUn.toCharArray();
			/*for(int i=0;i<j.length;i++)
			{
				if(j[].getText())
				{	
				System.out.println("First Character is alphabet");
				}
			}*/
			if(TUn.getText().equals(TPs.getText()))
			{
				System.out.println("\nUsername and Password are same that is not valid");	
			}
			if(!TPs.getText().equals(TCs.getText()))
			{
				System.out.println("\nPassword and Confirm Password are not same"+"\nPassword::"+TPs.getText()+"\nConfirm Password::"+TCs.getText());	
			}
			if(TPs.getText().length()<6)
			{
				System.out.println("\nPassword character is greater than size 6"+"\nPassword::"+TPs.getText());	
			}
			if(TPs.getText().length()>15)
			{
				System.out.println("\nPassword character is smaller than size 15\n"+"\nPassword::"+TPs.getText());	
			
			}
		}
		else
		{
			TUn.setText("");
			TPs.setText("");
			TCs.setText("");
			Login.setEnabled(true);
			Reset.setEnabled(false);
		}
	}
	public static void main(String a[])
	{
		Login_Event L=new Login_Event();
	}
}
		