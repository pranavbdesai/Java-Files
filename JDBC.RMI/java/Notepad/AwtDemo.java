import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AwtDemo" width=300 height=300>
</applet>
*/
public class AwtDemo extends Frame implements ActionListener
{
	MenuBar mnu ;
	Menu File,Edit,View,Help;
	MenuItem New,Open,Save,Close,Copy;
	TextArea content;
	public AwtDemo()
	{
		content = new TextArea();
		mnu = new MenuBar();
		setMenuBar(mnu);
	
		File = new Menu("File");
		Edit = new Menu("Edit");
		View = new Menu("View");
		Help = new Menu("Help");

		New = new MenuItem("New File");
		Open = new MenuItem("Open ");
		Save = new MenuItem("Save");
		Close = new MenuItem("Close");
		Copy = new MenuItem("Copy");

		New.addActionListener(this);
		Open.addActionListener(this);
		Save.addActionListener(this);
		Close.addActionListener(this);

		mnu.add(File);
		mnu.add(Edit);
		mnu.add(View);
		mnu.add(Help);

		File.add(New);
		File.add(Open);
		File.add(new MenuItem("-"));
		File.add(Save);
		File.add(new MenuItem("-"));
		File.add(Close);
	
		Edit.add(Copy);
			
		setSize(600,400);
		setTitle("UnTitled - Notepad");
		add(content);
		setVisible(true);

	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource()==New)
		{
			content.setText("");
		}
		else if (e.getSource()==Open)
		{
		FileDialog fd = new FileDialog(this,"Open File Jimit",FileDialog.LOAD);
		fd.setVisible(true);
		}
		else if (e.getSource()==Save)
		{
		FileDialog fd = new FileDialog(this,"Save File Jimit",FileDialog.SAVE);
		fd.setVisible(true);
		}
		else if(e.getSource()==Close)
		{
			dispose();
		}
		
	}


	public static void main(String arp[])
	{
		AwtDemo MN = new AwtDemo();
		
	}




}