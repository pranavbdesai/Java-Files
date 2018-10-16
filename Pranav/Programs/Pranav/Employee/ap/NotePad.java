import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class NotePad extends Frame implements ActionListener
{
	TextArea tf;
	MenuBar mnu;
	Menu File,Edit,Format,View,Help;
	MenuItem Open,Save,Close,Copy,Cut,Paste,Sub1,Sub2,Sub3;
	CheckboxMenuItem Debug,Testing;
	Menu New;
	public NotePad()
	{
		mnu=new MenuBar();
		setMenuBar(mnu);
		File=new Menu("File");
		Edit=new Menu("Edit");
		View=new Menu("View");
		Format=new Menu("Format");
		Help=new Menu("Help");
		mnu.add(File);
		mnu.add(Edit);
		mnu.add(View);
		mnu.add(Format);
		mnu.add(Help);
		New=new Menu("New");
		New.add(Sub1=new MenuItem("Sub1"));
		New.add(Sub2=new MenuItem("Sub2"));
		New.add(Sub3=new MenuItem("Sub3"));
		Debug=new CheckboxMenuItem("Debug");
		Testing=new CheckboxMenuItem("Testing");
		Open=new MenuItem("Open");
		Save=new MenuItem("Save");
		Close=new MenuItem("Close");
		Copy=new MenuItem("Copy");
		Cut=new MenuItem("Cut");
		Paste=new MenuItem("Paste");
		File.add(New);
		File.add(new MenuItem("-"));
		File.add(Open);
		File.add(new MenuItem("-"));
		File.add(Close);
		Edit.add(Copy);
		Edit.add(new MenuItem("-"));
		Edit.add(Cut);
		Edit.add(new MenuItem("-"));
		Edit.add(Paste);
		Format.add(Debug);
		Format.add(new MenuItem("-"));
		Format.add(Testing);
		Open.addActionListener(this);
		Save.addActionListener(this);
		tf=new TextArea();
		Help.setEnabled(false);
		add(tf);
		setTitle("Untitled-Notepad");
		setSize(700,600);
		setVisible(true);
		tf.setText("Hello James Bond");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Open)
		{
			FileDialog f=new FileDialog(this,"Open File",FileDialog.LOAD);
			f.setVisible(true);
		}
		else if(e.getSource()==Save)
		{
			FileDialog f=new FileDialog(this,"Save File",FileDialog.SAVE);
			f.setVisible(true);
		}
	}
	public static void main(String ar[])
	{
		NotePad N=new NotePad();
	}
}
