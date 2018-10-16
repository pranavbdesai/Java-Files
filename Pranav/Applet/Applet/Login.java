/*
	AWT Componenets
	Label
	Button
	TextField
	TextArea
	CheckBox
	CheckBoxGroup
	Choice
	List
	Panel
	Frame
	Menu
	MenuItem
	MenuBar
	FileDialog
	ScrollBar
	Image
*/	

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*<applet code="Login" width=300 height=400></applet>*/
public class Login extends Applet implements ActionListener
{
	Label LUn,LPs;
	TextField TUn,TPs;
	Button Submit,Reset;
	public void init()
	{
		LUn = new Label("User Name ");
		LPs = new Label("Pass Word");
		TUn = new TextField(20);
		TPs = new TextField(20);
		TPs.setEchoChar('#');
		TUn.setForeground(Color.red);
		TPs.setForeground(Color.red);
		//TUn.setFont(new Font("ARIAL",Font.PLAIN,20));
		//TUn.setBackground(Color.black);
		Submit = new Button("Submit");
		Reset = new Button("Reset");
		Submit.addActionListener(this);
		Reset.addActionListener(this);
		Reset.setEnabled(false);
		add(LUn);
		add(TUn);
		add(LPs);
		add(TPs);
		add(Submit);
		add(Reset);
				
	}

	public void actionPerformed(ActionEvent e)
	{
	String Str = e.getActionCommand(); // Gives the Caption of Button
	System.out.println(Str +" Button Pressed");
		if(Str.equals("Submit"))
		{
showStatus("User Name "+ TUn.getText() +" Password:" +TPs.getText());
		Submit.setEnabled(false);
		Reset.setEnabled(true);
		//new NotePad(TUn.getText());
		}
		else if(Str.equals("Reset"))
		{
		TUn.setText("");
		TPs.setText("");
		Submit.setEnabled(true);
		Reset.setEnabled(false);
		showStatus("Applet is Running");
		}
	}
}