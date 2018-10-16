import java.applet.*;
import java.awt.*;
/*
<applet code="Calculator" width=300 height=300>
</applet>
*/
public class Calculator extends Applet
{
	Button add,sub,mul,divi,mod;
	TextField T1,T2,T3;
	Label L1,L2,L3;
	Panel P1,P2,P3, P4;
	public void init()
	{
		P1 =new Panel();
		P2 =new Panel();
		P3 =new Panel();
		P4 =new Panel();

		T1=new TextField(15);
		T2=new TextField(15);
		T3=new TextField(15);
		L1=new Label("NO 1");
		L2=new Label("NO 2");
		L3=new Label("ANS");
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		divi=new Button("/");
		mod=new Button("%");
		T1.setBackground(Color.yellow);
		T2.setBackground(Color.yellow);
		T3.setBackground(Color.yellow);
		T1.setForeground(Color.red);
		T1.setFont(new Font("ARIAL",Font.PLAIN,20));
		P1.add(L1);
		P1.add(T1);
					
		P2.add(L2);
		P2.add(T2);
		P3.add(add);
		P3.add(sub);
		P3.add(mul);
		P3.add(divi);
		P3.add(mod);
		P4.add(L3);
		P4.add(T3);

		add(P1);
		add(P2);
		add(P3);
		add(P4);

	}
}