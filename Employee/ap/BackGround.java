import java.awt.*;
import java.applet.*;

/*<applet code="BackGround" Width=230 height=200></applet>*/

public class BackGround extends Applet
{
	Label Lf,Lb,Ls;
	Button Black,Blac,Red,Rd,Green,Gren,Blue,Blu;
	public void init()
	{
		Lf=new Label("Foreground Color");
		Black=new Button("Black");
		Red=new Button("Red");
		Green=new Button("Green");
		Blue=new Button("Blue");
		Lb=new Label("Background Color");
		Blac=new Button("Black");
		Rd=new Button("Red");		
		Gren=new Button("Green");
		Blu=new Button("Blue");
		Ls=new Label("Sample");
		add(Lf);
		add(Black);
		add(Red);
		add(Green);
		add(Blue);
		add(Lb);
		add(Blac);
		add(Rd);
		add(Gren);
		add(Blu);
		add(Ls);
	}		
}
