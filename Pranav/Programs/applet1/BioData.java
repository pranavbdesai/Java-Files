import java.awt.*;
import java.applet.*;

/*<applet code="BioData" Width=150 height=200></applet>*/

public class BioData extends Applet
{
	Label Ln,Lb,La,LNm,LBi,LAg;
	TextField Tn,Tb,Ta,TNm,TBi,TAg;
	Button Copy,Reset;
	public void init()
	{
		Ln=new Label("Enter Name",Ln.LEFT);
		Lb=new Label("Enter Birth Date",Lb.LEFT);		
		La=new Label("Enter Age",La.LEFT);
		Tn=new TextField(20);
		Tb=new TextField(20);
		Ta=new TextField(20);
		Copy=new Button("Copy");
		Reset=new Button("Reset");
		LNm=new Label("Enter Name",LNm.LEFT);
		LBi=new Label("Enter Birth Date",LBi.LEFT);		
		LAg=new Label("Enter Age",LAg.LEFT);
		TNm=new TextField(20);
		TBi=new TextField(20);
		TAg=new TextField(20);
		add(Ln);
		add(Tn);
		add(Lb);
		add(Tb);
		add(La);
		add(Ta);
		add(Copy);
		add(Reset);
		add(LNm);
		add(TNm);
		add(LBi);
		add(TBi);
		add(LAg);
		add(TAg);
	}		
}
