import java.awt.*;
import java.applet.*;
import javax.swing.*;
public class NotePad extends JFrame 
{
	MenuBar mnu;
	Menu File,Edit,View;
	TextArea tf;
	MenuItem New,Open,Save,Close,Copy;

	public NotePad()
	{
		mnu = new MenuBar();
		setMenuBar(mnu);
		File = new Menu("File");
		Edit = new Menu("Edit");
		View = new Menu("View");
		tf = new TextArea();
		mnu.add(File);
		mnu.add(Edit);
		mnu.add(View);
		New = new MenuItem("New");
		Open=new MenuItem("Open");
		Save=new MenuItem("Save");
		Close=new MenuItem("Close");
		Copy = new MenuItem("Copy");
		File.add(New);
		File.add(Open);
		File.add(new MenuItem("-"));
		File.add(Save);
		File.add(new MenuItem("-"));
		File.add(Close);
		Edit.add(Copy);
		setTitle("Untitled -Notepad");
		setSize(600,500);
		setVisible(true);
		add(tf);
	}
	public static void main(String arp[])
	{
		NotePad N = new NotePad();
	}

}