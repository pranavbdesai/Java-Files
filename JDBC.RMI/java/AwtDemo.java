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
	<applet code="Login" width=500 height=400>
	</applet>*/
	public class Login extends Applet
	{
		Label Un,Ps;
		TextField TUn,TPs;
		Button Submit, Reset;
		public void init()
		{
		Un = new Label("User Name ");
		Ps = new Label("Pass Word ");
		TUn = new TextField(15);
		TPs = new TextField(15);
		Submit = new Button("Submit");
		Reset = new Button("Reset");
		add(Un);
		add(TUn);
		add(Ps);
		add(TPs);
		add(Submit);
		add(Reset);
		}
	
	}
	
