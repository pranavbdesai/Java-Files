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
	<applet code="color" width=250 height=400>
	</applet>*/
	public class color extends Applet
	{
		Label foreground,background,sample;
		Button red,green,black,yellow,white,red1,green1,black1,yellow1,white1;
		public void init()
		{
		foreground = new Label("ForeGround ");
		red = new Button("RED");
		green = new Button("GREEN");
		black = new Button("BLACK");
		yellow = new Button("YELLOW");
		white = new Button("WHITE");
		background = new Label("BackGround ");
		red1 = new Button("RED");
		green1 = new Button("GREEN");
		black1 = new Button("BLACK");
		yellow1 = new Button("YELLOW");
		white1 = new Button("WHITE");
		sample = new Label("Sample");
		add(foreground);
		add(red);
		add(green);
		add(black);
		add(yellow);
		add(white);
		add(background);
		add(red1);
		add(green1);
		add(black1);
		add(yellow1);
		add(white1);
		add(sample);
		}
	
	}
	
