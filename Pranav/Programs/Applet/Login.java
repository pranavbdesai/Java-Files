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
	<applet code="Login" width=300 height=200>
	</applet>    */
	public class Login extends Applet
	{
		Label Un,Ps;
		TextField TUn,TPs;
		Button Submit, Reset;
		public void init()
		{
		setBackground(Color.cyan);
		Un = new Label("User Name ");
		Ps = new Label("Pass Word ");
		TUn = new TextField(20);
		TPs = new TextField(20);
		TPs.setBackground(Color.cyan);
		Submit = new Button("Submit");
		Submit.setForeground(Color.red);
		Submit.setBackground(Color.blue);
		Reset = new Button("Reset");
		TPs.setEchoChar('#');
		add(Un);
		add(TUn);
		add(Ps);
		add(TPs);
		add(Submit);
		add(Reset);
		}
	
	}
	
