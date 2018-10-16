import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="ECalculator" width=300 height=500>
</applet>
*/

public class ECalculator extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button add,sub,mul,divi,mod,reset;
	public void init()
	{
		l1=new Label("No 1");
		l2=new Label("No 2");
		l3=new Label("ANS");
		t1=new TextField(20);
		t2=new TextField(20);
		t3=new TextField(25);
		add=new Button("+");
		sub=new Button("-");
		mul= new Button("*");
		divi=new Button("/");
		mod=new Button("%");
		reset=new Button("RESET");
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		divi.addActionListener(this);
		mod.addActionListener(this);
		reset.addActionListener(this);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(add);
		add(sub);
		add(mul);
		add(divi);
		add(mod);
		add(l3);
		add(t3);
		add(reset);
	}

	public void actionPerformed(ActionEvent e)
	{
		reset.setEnabled(true);
		String S=e.getActionCommand();
		if(S.equals("+"))
		{
			t3.setText(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())+"");
			showStatus(""+Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText()));
			reset.setEnabled(true);		
		}
		else if(S.equals("-"))
		{
			t3.setText(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())+"");
			showStatus(""+(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));
			reset.setEnabled(true);		
		}
                                  else if(S.equals("*"))
		{
			t3.setText(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())+"");
			showStatus(""+(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));
			reset.setEnabled(true);		
		}
                                  

		if(S.equals("RESET"))
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			
		}



	}
           }
