/* Using Frame */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Notepad extends Frame implements ActionListener
{
	MenuBar mnu;
	Menu File,Edit,Format,View, Help;
	MenuItem New,Open,Save,Close,Info;
	MenuItem line;
	TextArea Content;
	public Notepad()
	{
		Content = new TextArea();
		mnu = new MenuBar();
		File = new Menu("File");
		Edit = new Menu("Edit");
		Format = new Menu("Format");
		View = new Menu("View");
		Help = new Menu("Help");
		Info = new MenuItem("About Notepad");
		mnu.add(File);
		mnu.add(Edit);
		mnu.add(Format);
		mnu.add(View);
		mnu.add(Help);
		
		New = new MenuItem("New..");
		Open = new MenuItem("Open..");
		Save= new MenuItem("Save..");
		Close = new MenuItem("Close..");
		line = new MenuItem("-");
		New.addActionListener(this);
		Open.addActionListener(this);
		Save.addActionListener(this);
		Close.addActionListener(this);
		File.add(New);
		File.add(Open);
		File.add(Save);
		File.add(line);
		File.add(Close);
		Help.add(Info);
		setMenuBar(mnu);
		setTitle("Untitled - Notepad");
		setSize(700,500);
		setVisible(true);
		add(Content);
	}
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource()==Open)
		{
		FileDialog fd = new FileDialog(this,"Open A File",FileDialog.LOAD);
		fd.setVisible(true);
		}
		else if (e.getSource()==Save)
		{
FileDialog fd = new FileDialog(this,"Save A File",FileDialog.SAVE);
		fd.setVisible(true);
		}
		else if (e.getSource()==Close)
		{
		System.exit(0);
		}
		else if (e.getSource()==New)
		{
		Content.setText("");
		}		
	}
	public static void main(String ar[])
	{
		Notepad N = new Notepad();
	}
}