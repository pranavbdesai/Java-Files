import java.awt.*;
import java.applet.*;
/*
	<applet code="paint" width=250 height=400>
	</applet>*/
	public class paint extends Applet 
	{
		Button Fill;
		Checkbox Red,Green,Blue;
		public void init()
		{
		Fill = new Button("Fill");
		Red = new Checkbox("Red");
		Green = new Checkbox("Green");
		Blue = new Checkbox("Blue");
		add(Red);	
		add(Green);
		add(Blue);
		add(Fill);
		}
	
	}
	
