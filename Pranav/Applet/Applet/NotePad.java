import java.awt.*;
import java.applet.*;
public class NotePad extends Frame
{
	MenuBar mnu;
	Menu File,Edit,View,Help;
	MenuItem New,Open,Save,Close,Copy,Paste;
	TextArea Content;
	public NotePad(String Title)
	{
		mnu = new MenuBar();
		Content = new TextArea();
		setMenuBar(mnu);
		File = new Menu("File");
		Edit = new Menu("Edit");
		View = new Menu("View");
		Help = new Menu("Help");
		New = new MenuItem("New");
		Open = new MenuItem("Open");
		Save = new MenuItem("Save");
		
		Close = new MenuItem("Close");
		Copy = new MenuItem("Copy");
		Paste = new MenuItem("Paste");
		File.add(Open);
		File.add(New);
		File.add(Save);
		File.add(new MenuItem("-"));
		File.add(Close);
		Edit.add(Copy);
		Edit.add(new MenuItem("-"));
		Edit.add(Paste);
		mnu.add(File);
		mnu.add(Edit);
		mnu.add(View);
		mnu.add(Help);
		add(Content);
		setTitle(Title);
		setSize(400,500);
		setVisible(true);
	}	
	/*public static void main(String arp[])
	{
		NotePad N = new NotePad();
	}*/
}