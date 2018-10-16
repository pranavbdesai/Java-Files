import java.awt.*;
import java.applet.*;

/*<applet code="AwtDemo" width=250 height=300>
</applet>*/

public class AwtDemo extends Applet
{
	Choice City;
	Checkbox Sports,News,Male,Female;
	CheckboxGroup cbg;
	TextArea Addr;
	List Edu;	
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		City  = new Choice();
		Sports = new Checkbox("Sports....");
		News = new Checkbox("News",true);
		cbg = new CheckboxGroup();
		Male = new Checkbox("Male",true,cbg);
		Female = new Checkbox("Female",false,cbg);
		
		Addr = new TextArea(3,15);
		Edu = new List(6,true);
	
		Edu.add("BSc");
		Edu.add("Msc");
		Edu.add("BCA");
		Edu.add("MCA");
		Edu.add("Bcom");
		Edu.add("BE");
	
		City.add("ANAND");
		City.add("Surat");
		City.add("Chennai");
		City.add("Vadodara");
	
		add(new Label("Select Your City "));
		add(City);
		add(new Label("Your Hobbies"));
		add(Sports);
		add(News);
		City.setEnabled(false);
		Sports.setVisible(false);
		add(new Label("Your Gender"));
		add(Male);
		add(Female);	
		
		add(new Label("Your Address "));
		add(Addr);

		add(new Label("Qualification"));
		add(Edu);
	}
	public void paint(Graphics G)
	{
	showStatus("Learning AWT Components");	
	}
}