	/*
	AWT COMPONENTS : Abstract Window  Toolkit
	Button
	TextField
	Label
	Choice
	List
	CheckBox
	CheckBoxGroup
	CheckBoxMenuItem
	Menu
	MenuItem
	Frame
	MenuBar
	FileDialog
	Image
	Panel
	TextArea
	ScrollBar
	*/


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
	/*
	<applet code="Login" width=300 height=400>
	</applet>*/

	public class Login extends Applet implements ActionListener
	{
		Label Un,Ps;
		TextField TUn,TPs;
		Button Submit, Reset;
		public void init()
		{
		setBackground(Color.blue);
		Un = new Label("User Name ");
		Ps = new Label("Pass Word ");
		TUn = new TextField(20);
		TPs = new TextField(20);
		TPs.setEchoChar('*');
		Submit = new Button("Login");
		Reset = new Button("Reset");
		Submit.addActionListener(this);
		Reset.addActionListener(this);
		add(Un);
		add(TUn);
		add(Ps);
		add(TPs);
		add(Submit);
		add(Reset);
		}
	public void actionPerformed(ActionEvent e)
	{
		String str= e.getActionCommand();
		System.out.println("Str : "+str);
		if(str.equals("Login"))
		{
			System.out.println("Username:"+TUn.getText());
			System.out.println("Password:"+TPs.getText());
		}
		else
		{
			TUn.setText("");
			TPs.setText("");
		}
	}
}
	
