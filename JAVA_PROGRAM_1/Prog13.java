import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Prog13" width=250 height=160>
</applet>
*/
public class Prog13 extends Applet implements ActionListener
{
TextField o1,o2,o3;
double v1,v2,result;
public void init()
{
setBackground(Color.yellow);
//setLayout(new BorderLayout());
Label op1=new Label("OPERAND 1:",Label.RIGHT);
Label op2=new Label("OPERAND 2:",Label.RIGHT);
Label op3=new Label("RESULT:",Label.RIGHT);
o1=new TextField(10);
o2=new TextField(10);
o3=new TextField(10);
Button b1=new Button("ADD");
Button b2=new Button("SUB");
Button b3=new Button("CLEAR");
Button b4=new Button("QUIT");
add(op1);
add(o1);
add(op2);
add(o2);
add(op3);
add(o3);
add(b4);
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b2.addActionListener(this);
o1.addActionListener(this);
o2.addActionListener(this);
o3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String str=ae.getActionCommand();
if(str.equals("ADD"))
{
v1=Double.parseDouble(o1.getText());
v2=Double.parseDouble(o2.getText());
result=v1+v2;
o3.setText(""+result);
}
if(str.equals("SUB"))
{
v1=Double.parseDouble(o1.getText());
v2=Double.parseDouble(o2.getText());
result=v1-v2;
o3.setText(""+result);
}
if(str.equals("CLEAR"))
{
o3.setText("");
o1.setText("");
o2.setText("");
}
if(str.equals("QUIT"))
{
System.exit(1);
}
}
}




