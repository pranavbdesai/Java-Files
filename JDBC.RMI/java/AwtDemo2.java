import java.awt.*;
import java.applet.*;
/*<applet code="AwtDemo2" width=300 height=600>
</applet>
*/
public class AwtDemo2 extends Applet
{
	TextArea tf;
	Choice city; //ComboBox
	List Edu; //Multiple Selection
	Checkbox News,Sports,Male,Female;
	CheckboxGroup cbg;
	Panel P1,P2,P3,P4,P5;
	public void init()
	{
		P1 = new Panel();
		P2 = new Panel();
		P3 = new Panel();
		P4 = new Panel();
		P5 = new Panel();
		setLayout(new FlowLayout(FlowLayout.LEFT));
		tf = new TextArea(5,19);
		city = new Choice();
		Edu = new List(4,true);
		News = new Checkbox("News.",false);
		Sports = new Checkbox("Sports",false);	

		cbg= new CheckboxGroup();

		Male = new Checkbox("Male",true,cbg);
		Female = new Checkbox("Female",false,cbg);
		
			
		city.add("ANAND");
		city.add("Surat");
		city.add("Chennai");
		city.add("Mumbai");
		city.add("V.V.Nagar");

		Edu.add("B.Com");
		Edu.add("M.Com");
		Edu.add("BCA");
		Edu.add("MCA");
		Edu.add("PGDCA");
		Edu.add("MIS");
		Edu.add("MSc");
		P1.add(new Label("Address "));
		P1.add(tf);
		P2.add(new Label("Select City "));
		P2.add(city);
		P3.add(new Label("Education "));
		P3.add(Edu);	
		P4.add(new Label("Hobbies "));
		P4.add(News);
		P4.add(Sports);
		P5.add(new Label("Gender "));
		P5.add(Male);
		P5.add(Female);
		add(P1);
		add(P2);
		add(P3);
		add(P4);
		add(P5);
	}
}
