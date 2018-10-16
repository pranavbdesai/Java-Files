import java.awt.*;
import java.applet.*;
	/*
	<applet code="AwtDemo1" width=300 height=200>
	</applet>*/
	public class AwtDemo1 extends Applet
	{
		TextArea tf;	
		Panel P1,P2,P3,P4;
		Choice city; //Combobox
		List Edu; // COmbo Box - Multiple Value 
		Checkbox News,Sports,Male,Female;
		CheckboxGroup cbg;
		Choice Day;
		public void init()
		{
			P1 = new Panel();
			P2 = new Panel();
			P3 = new Panel();
			P4 = new Panel();

			tf = new TextArea(5,30);
			city = new Choice();
			city.add("ANAND");
			city.add("VVNAGAR");
			city.add("Vaddoara");
			Day = new Choice();
			for(int i=1;i<=31;i++)
			{
				Day.add(""+i);
			}
			Edu = new List(3,true);	
			Edu.add("BSC");
			Edu.add("MSC");
			Edu.add("B.E.");
			Edu.add("M.C.A.");
			Edu.add("B.C.A.");
		
	News = new Checkbox("News ",false);
	Sports =new Checkbox("SPORTS",true);
	
	cbg = new CheckboxGroup();

	Male = new Checkbox("Male",false,cbg);
	Female = new Checkbox("Female",false,cbg);			
			P1.add(tf);
			P2.add(city);
			P2.add(Edu);
			P3.add(News);
			P3.add(Sports);
			P4.add(Male);
			P4.add(Female);
			P1.add(Day);
			add(P1);
			add(P2);
			add(P3);
			add(P4);

		}
	}