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
	<applet code="Login" width=250 height=400>
	</applet>*/
	public class Login extends Applet
	{
		Label un,ps;
		TextField Tun,Tps;
		Button submit,reset;
		Checkbox Sports, News,Male,Female;
		TextArea adrs;
		Choice City;
		List Edu;
		CheckboxGroup cbg;
		public void init()
		{
		un = new Label("USER NAME ");
		ps = new Label("PASSWORD ");
		Tun = new TextField(15);
 		Tps = new TextField(15);
		Tps.setEchoChar('*');
		submit = new Button("SUBMIT");
		reset = new Button("RESET");
		Sports = new Checkbox("Sports");
		News = new Checkbox("News");
		adrs = new TextArea(5,25);
		City = new Choice();
		City.add("ANAND");
		City.add("Surat");
		City.add("Vadodara");
		Edu = new List(4,true);
		add(un);
		add(Tun);
		add(ps);
		add(Tps);
		add(submit);
		add(reset);
		add(new Label("Select Ur Hobbie"));
		add(Sports);
		add(News);
		add(new Label("Your Address"));
		add(adrs);
		add(new Label("Your CIty "));
		add(City);
		Edu.add("BSC");
		Edu.add("MSC");
		Edu.add("MCA");
		Edu.add("BE");		
		Edu.add("PGDCA");
		Edu.add("BCom");
		add(new Label("Ur Education "));
		add(Edu);
		cbg=  new CheckboxGroup();
		Male = new Checkbox("Male",true,cbg);
		Female = new Checkbox("FeMale",false,cbg);
		add(new Label("Your Gender"));
		add(Male);
		add(Female);
		}
	}