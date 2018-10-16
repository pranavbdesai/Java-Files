import java.awt.*;
import java.applet.*;
import java.awt.event.*;


/*
<applet code="amtc" width=300 height=300>
</applet>
*/

public class amtc extends Applet implements ItemListener,KeyListener
{
Label amt,nm,roi,iamt,namt;
TextField 	t1,t2,t3;
CheckboxGroup b1;
Choice mon;
Checkbox five,four;
float R=4,N,I;
int P;
public void init()
{
	amt= new Label("Amount");
	nm =new Label("No of Interest");
	roi =new Label("Rate of Interest");
	iamt =new Label("Interest Amt");
	namt =new Label("Net Amt");
	mon = new Choice();
	
	for(int i=1;i<=12;i++)
	{
		mon.add(""+i);
	}
	
	t1=new TextField("0",20);
	t2=new TextField(20);
	t3=new TextField(20);
	
	b1=new CheckboxGroup();
	
	four = new Checkbox("4%",true,b1);
	five = new Checkbox("5%",false,b1);
	
	add(amt);
	add(t1);
	add(nm);
	add(mon);
	add(roi);
	add(four);
	add(five);
	add(iamt);
	add(t2);
	add(namt);
	add(t3);
	
	t1.addKeyListener(this);
	mon.addItemListener(this);
	five.addItemListener(this);
	four.addItemListener(this);
	}
	
	public void keyPressed(KeyEvent ke)
	{
		char code= ke.getKeyChar();
		System.out.println(code);
		
		if((int)code>=48 && (int)code<=57)
		{
			P =Integer.parseInt(t1.getText());
			N = Integer.parseInt(mon.getSelectedItem());		
			I = P*N*R/100;
			t2.setText(""+I);
			t3.setText(""+ (P+I));			
		}
			
	}
	
	public void keyTyped(KeyEvent ke)
	{
		
	}
	public void keyReleased(KeyEvent ke){}
	public void itemStateChanged(ItemEvent ie)
	{
		if(five.getState()==true)
		{		
			R=5;
		}
		else
		{
			R=4;
		}
		P =Integer.parseInt(t1.getText());
		N = Integer.parseInt(mon.getSelectedItem());		
			I = P*N*R/100;
			t2.setText(""+I);
			t3.setText(""+ (P+I));		
	}
}