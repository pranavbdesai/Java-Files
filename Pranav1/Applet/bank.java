import java.awt.*;
import java.applet.*;
/*
	<applet code="bank" width=250 height=400>
	</applet>*/
	public class bank extends Applet 
	{
		Label Amount;
		TextField Tamt;
		Button Calculate,Reset;
		Choice nom;
		Checkbox Five,Ten,Twelve;
		CheckboxGroup cbg;
		TextArea txt;
		public void init()
		{
		Amount = new Label("Amount");
		Tamt = new TextField(15);
		Calculate = new Button("Calculate");
		Reset = new Button("Reset");
		nom = new Choice();
		nom.add("1");
		nom.add("2");
		nom.add("3");
		nom.add("4");
		nom.add("5");
		nom.add("6");
		nom.add("7");
		nom.add("8");
		nom.add("9");
		nom.add("10");
		nom.add("11");
		nom.add("12");
		cbg=  new CheckboxGroup();
		Five = new Checkbox("5%",true,cbg);
		Ten = new Checkbox("10%",false,cbg);
		Twelve = new Checkbox("12%",false,cbg);
		add(Amount);
		add(Tamt);
		add(Calculate);
		add(new Label("No. of Month"));
		add(nom);
		txt = new TextArea(5,20);
		add(new Label("Rate Of Interest"));
		add(Five);
		add(Ten);
		add(Twelve);
		add(Reset);
		add(txt);
		}
	
	}
	
