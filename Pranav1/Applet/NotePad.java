import java.awt.*;
import java.applet.*;

public class NotePad extends Frame
{
	MenuBar mnu;
	Menu File,Edit,Format,View;
	MenuItem New,Open,Save,Close;
	TextArea Content;
	public NotePad()
	{
		setTitle("Untitled - Notepad");
		setSize(500,500);
		setVisible(true);
		mnu = new MenuBar();
		setMenuBar(mnu);
		File = new Menu("File");
		Edit = new Menu("Edit");
		Format = new Menu("Format");
		View =new Menu("View");
		New = new MenuItem("New");
		Open = new MenuItem("Open");
		Save = new MenuItem("Save");
		Close = new MenuItem("Close");
		File.add(New);
		File.add(Open);
		File.add(new MenuItem("-"));
		File.add(Save);
		Edit.add(Close);
		mnu.add(File);
		mnu.add(Edit);
		mnu.add(Format);
		mnu.add(View);
		Content = new TextArea();
		add(Content);
	}
	public static void main(String ar[])
	{
		NotePad N = new NotePad();
	}
}