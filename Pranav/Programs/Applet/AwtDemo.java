	/*
	AWT COMPONENTS : Abstract Window  Toolkit
	Button
	TextField
	Label
	Choice
	List
	CheckBox
	CheckBoxGroup
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
import java.applet.*;
	/*
	<applet code="AwtDemo" width=300 height=200>
	</applet>*/
	public class AwtDemo extends Applet
	{
		Label Un,Ps;
		TextField TUn,TPs;
		Button Submit, Reset;
		public void init()
		{
		Un = new Label("User Name ");
		Ps = new Label("Pass Word ");
		TUn = new TextField(20);
		TPs = new TextField(20);
		Submit = new Button("Submit");
		Reset = new Button("Reset");
		TPs.setForeground(Color.blue);
		TPs.setBackground(Color.yellow);
		TPs.setEchoChar('#');
		add(Un);
		add(TUn);
		add(Ps);
		add(TPs);
		add(Submit);
		add(Reset);
		}
	
	}