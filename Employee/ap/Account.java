import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Account extends Frame implements ActionListener
{
	TextField Tamt,TIamt,TNamt;
	Label Lamt,Lmn,LIamt,LNamt,LRi;
	Button Calculate,Reset;
	Choice mn;
	Checkbox r1,r2,r3,r4;
	CheckboxGroup Interest;
	public Account()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		Tamt=new TextField(20);
		TIamt=new TextField(20);
		TNamt=new TextField(20);
		
		mn=new Choice();
		mn.add("1");
		mn.add("2");
		mn.add("3");
		mn.add("4");
		mn.add("5");
		mn.add("6");
		mn.add("7");
		mn.add("8");
		mn.add("9");
		mn.add("10");
		mn.add("11");
		mn.add("12");

		Lamt=new Label("Amount");
		Lmn=new Label("Month");
		LRi=new Label("Rate of Interest");
		LIamt=new Label("Interest Amount");
		LNamt=new Label("Net Amount");

		Interest=new CheckboxGroup();
		r1=new Checkbox("08",true,Interest);
		r2=new Checkbox("10",false,Interest);
		r3=new Checkbox("12",false,Interest);
		r4=new Checkbox("15",false,Interest);

		Panel p1=new Panel();
		p1.add(Lamt);
		p1.add(Tamt);
		
		Panel p2=new Panel();
		p2.add(Lmn);
		p2.add(mn);
		
		Panel p3=new Panel();
		p3.add(LRi);
		p3.add(r1);
		p3.add(r2);
		p3.add(r3);
		p3.add(r4);
		
		Panel p4=new Panel();
		p4.add(LIamt);
		p4.add(TIamt);
		
		Panel p5=new Panel();
		p5.add(LNamt);
		p5.add(TNamt);
		
		Calculate=new Button("Calculate");
		Reset=new Button("Reset");
		Calculate.addActionListener(this);
		Reset.addActionListener(this);

		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(Calculate);
		add(Reset);
		

		Reset.setEnabled(false);
		setSize(300,300);
		setTitle("Interest application");
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		System.out.println(s+"Button is Pressed");
		if(s.equals("Calculate"))
		{	
			Calculate.setEnabled(false);
			Reset.setEnabled(true);

			int P=Integer.parseInt(Tamt.getText());
			System.out.println("Amount:"+P);
			String N=mn.getSelectedItem();
			System.out.println("Month:"+N);
			Checkbox R=Interest.getSelectedCheckbox();
			System.out.println("Rate of Interest:"+R.getLabel());
			
			int IA=(P*Integer.parseInt(N)*Integer.parseInt				(R.getLabel())/100);

			TIamt.setText(""+IA);
			System.out.println("Inrerest:"+IA);		
			int L=Integer.parseInt(TIamt.getText());
			TNamt.setText(""+(L+P));
			System.out.println("Net Amount:"+(L+P));
		}
		else
		{
			Tamt.setText("");
			TIamt.setText("");
			TNamt.setText("");
			Calculate.setEnabled(true);
			Reset.setEnabled(false);
		}
	}
	public static void main(String a[])
	{
		Account A=new Account();
	}
}
		