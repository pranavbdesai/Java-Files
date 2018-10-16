import java.awt.*;
import java.applet.*;

/*<applet code="AwtDemo" Width=200 height=200></applet>*/

public class AwtDemo extends Applet
{
	Label LUn,LPs;
	TextField TUn,TPs;
	Button Submit,Reset;
	public void init()
	{
		LUn=new Label("User Name");
		LPs=new Label("Pass word");		
		TUn=new TextField(20);
		TPs=new TextField(20);
		Submit=new Button("Submit");
		Reset=new Button("Reset");
		TPs.setEchoChar('*');
		add(LUn);
		add(TUn);
		add(LPs);
		add(TPs);
		add(Submit);
		add(Reset);
	}
}