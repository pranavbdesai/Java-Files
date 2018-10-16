import java.applet.*;
import java.awt.*;
/*
<applet code="Inventory" width="500" height="500">
</applet>
*/
public class Inventory extends Applet 
{
	Label L1,L2,L3,L4,L5;
	TextField T1,T2,T3;
	Button B1,B2;
	Choice Months;
	Checkbox O,T,Th;
	CheckboxGroup cbg;
	
	public void init()
	{
		L1=new Label("Amount");
		L2=new Label("No. of Months");
		L3=new Label("Rate Of Interest");
		L4=new Label("Interest Amount");
		L5=new Label("Net Amont");
		T1=new TextField(10);
		T2=new TextField(10);
		T3=new TextField(10);
		Months= new Choice();
		cbg=new CheckboxGroup();
		O=new Checkbox("5%",true,cbg);
		T=new Checkbox("10%",true,cbg);
		Th=new Checkbox("12%",true,cbg);
		B1=new Button("Calculate");
		B2=new Button("Reset");

		add(L1);
		add(T1);
		add(L2);
add(Months);
		Months.add("01");
		Months.add("02");
		Months.add("03");
Months.add("04");
Months.add("05");
Months.add("06");
Months.add("07");
Months.add("08");
Months.add("09");
Months.add("10");
Months.add("11");
Months.add("12");


		add(L3);
		add(O);
		add(T);
		add(Th);
		add(B1);
		add(B2);
		
		add(L4);
		add(T2);
		add(L5);
	add(T3);
	}
}