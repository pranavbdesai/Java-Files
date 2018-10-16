import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="calc" width=300 height=300>
</applet>
*/
public class calc extends Applet implements KeyListener,ActionListener
{
	Label no1,no2;
	int n1,n2;
	TextField tf1,tf2,t3;
	Button plus,min,mod,mul,ans;
		
	Panel p1,p2,p3;
	public void init()
	{
	this.setLayout(new GridLayout(3,1));
	
	p1=new Panel();
	p2=new Panel();
	p3=new Panel();
	tf1=new TextField(9);
	tf2=new TextField(9);
	t3=new TextField(10);

	no1=new Label("number1");
	no2=new Label("number2");
	plus=new Button("+");
	min=new Button("-");
	mod=new Button("%");
	mul=new Button("*");
	ans=new Button("Answer");	
	ans.setEnabled(false);
	tf1.addKeyListener(this);
	tf2.addKeyListener(this);
		ans.addActionListener(this);
		plus.addActionListener(this);
		min.addActionListener(this);
		mod.addActionListener(this);
		mul.addActionListener(this);

		p1.add(no1);
		p1.add(tf1);
		p1.add(no2);
		p1.add(tf2);	
		
		p2.add(new Label("operaters"));
		p2.add(plus);
		p2.add(min);
		p2.add(mod);
		p2.add(mul);
		
		p3.add(ans);
		p3.add(t3);

add(p1);
add(p2);
add(p3);
}
public void keyPressed(KeyEvent ke)
	{

	}
public void keyTyped(KeyEvent ke)
	{
		System.out.println("Lenght : " + tf1.getText().length());
		if(tf1.getText().length()>0)
		{		
			ans.setEnabled(true);
		System.out.println("key Code : " + ke.getKeyChar());
		}
		else if(tf2.getText().length()>0)
		{		
			ans.setEnabled(true);
		System.out.println("key Code : " + ke.getKeyChar());
		}
		else
		{
			ans.setEnabled(false);
		}
	}
public void keyReleased(KeyEvent ke)	
	{
	}
	public void actionPerformed(ActionEvent e)
	{
		n1=Integer.parseInt(tf1.getText());
		n2=Integer.parseInt(tf2.getText());
		if(e.getSource()==ans)
		{
		showStatus(" Answer " + t3.getText());	
		}
		 if(e.getSource()==plus)
		{
		int a=n1+n2;
		 t3.setText(""+a);
				
		}
		 if(e.getSource()==min)
		{
		int an=n1-n2;
		 t3.setText(""+an);
				
		}
		if(e.getSource()==mod)
		{
		 t3.setText(""+n1/n2);
				
		}
		if (e.getSource()==mul)
		{
		  t3.setText(""+n1*n2);
				
		}
	}
}