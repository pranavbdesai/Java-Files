import java.awt.*;

import java.awt.event.*;

class calc extends Frame implements ActionListener
{
	Label no1,no2;
	int n1,n2;
	TextField tf1,tf2,t3;
	Button plus,min,mod,mul,ans;
	mywa m1;	
	Panel p1,p2,p3;
	calc(String t)
	{
	super(t);
	this.setLayout(new GridLayout(4,2));
	
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
	ans.setEnabled(true);
	
		ans.addActionListener(this);
		plus.addActionListener(this);
		min.addActionListener(this);
		mod.addActionListener(this);
		mul.addActionListener(this);
		this.addWindowListener(m1);	
	
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

public void actionPerformed(ActionEvent e)
	{
		n1=Integer.parseInt(tf1.getText());
		n2=Integer.parseInt(tf2.getText());
		if(e.getSource()==ans)
		{
			
		
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
}

class calc_main
{
public static void main(String s[])
{
calc c1=new calc("calc");
c1.setSize(400,400);
c1.setVisible(true);

}

}
class mywa extends WindowAdapter
{
	calc n1;
	mywa(calc n1)
	{
	this.n1=n1;
	}
		public void windowClosing(WindowEvent we)
		{
			System.exit(1);
		}


}
