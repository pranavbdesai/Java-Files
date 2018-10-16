import java.awt.*;
import java.applet.*;

/*<applet code="Arithmetic" Width=150 height=200></applet>*/

public class Arithmetic extends Applet
{
	Label LNo1,LNo2,LNo3;
	TextField TNo1,TNo2,TNo3;
	Button Add,Sub,Mul,Div,Mod;
	public void init()
	{
		LNo1=new Label("No1");
		LNo2=new Label("No2");
		LNo3=new Label("No3");		
		TNo1=new TextField(10);		
		TNo2=new TextField(10);
		TNo3=new TextField(10);
		Add=new Button("+");
		Sub=new Button("-");
		Mul=new Button("*");
		Div=new Button("/");
		Mod=new Button("%");
		add(LNo1);
		add(TNo1);
		add(LNo2);
		add(TNo2);
		add(Add);
		add(Sub);
		add(Mul);
		add(Div);
		add(Mod);
		add(LNo3);
		add(TNo3);
		
	}
}