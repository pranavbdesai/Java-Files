import java.awt.*;
import java.applet.*;
 
public class NotePad extends Frame
{
	TextArea Tf;
	MenuBar mnu;
	Menu File,Edit,Format,View,Help;
	MenuItem Open,Save,Close,Copy,Paste;
	CheckboxMenuItem  Debug,Testing;
	Menu New;
	public NotePad()
	{
		mnu=new MenuBar();
		setMenuBar(mnu);

		File=new Menu("File");
		Edit=new Menu("Edit");
		Format=new Menu("Format");
		View=new Menu("View");
		Help=new Menu("Help");

		mnu.add(File);
		mnu.add(Edit);
		mnu.add(Format);
		mnu.add(View);
		mnu.add(Help);

		New=new Menu("New");
		MenuItem Sub1,Sub2,Sub3;
		New.add(Sub1=new MenuItem("Sub1"));
		New.add(Sub2=new MenuItem("Sub2"));
		New.add(Sub3=new MenuItem("Sub3"));

		Debug=new CheckboxMenuItem("Debug");
		Testing=new CheckboxMenuItem("Testing");
		Open=new MenuItem("Open");
		Save=new MenuItem("Save");
		Copy=new MenuItem("Copy");
		Paste=new MenuItem("Paste");
		Close=new MenuItem("Close");

		File.add(New);
		File.add(new MenuItem("-"));
		File.add(Open);
		File.add(Save);
		File.add(new MenuItem("-"));
		File.add(Close);
		Edit.add(Copy);
		Edit.add(new MenuItem("-"));
		Edit.add(Paste);
		Format.add(Debug);
		Format.add(Testing);

		Tf=new TextArea();
		Help.setEnabled(false);
		add(Tf);
		setTitle("Untitled-NotePad");
		setSize(700,600);
		setVisible(true);
		Tf.setText("Hello");
		
	}
	public static void main(String ar[])
	{
		NotePad N=new NotePad();
	}
}