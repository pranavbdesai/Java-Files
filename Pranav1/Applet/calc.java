import java.awt.*;
import java.applet.*;
/*
	<applet code="calc" width=250 height=400>
	</applet>*/
	public class calc extends Applet 
	{
		Label No1,No2,Ans;
		TextField TNo1,TNo2,TAns;
		Button plus,minus,mul,div,per;
		public void init()
		{
		No1 = new Label("No 1 ");
		No2 = new Label("No 2 ");
		Ans = new Label("Ans");
		TNo1 = new TextField(15);
		TNo2 = new TextField(15);
		TAns = new TextField(15);
		plus = new Button("+");
		minus = new Button("-");
		mul = new Button("*");		
		div = new Button("/");
		per = new Button("%");
		add(No1);
		add(TNo1);
		add(No2);
		add(TNo2);
		add(plus);
		add(minus);
		add(mul);
		add(div);
		add(per);		
		add(Ans);
		add(TAns);
		
		}
	
	}
	
