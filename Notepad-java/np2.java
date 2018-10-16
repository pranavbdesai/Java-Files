import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
//Frame : it is a child window of applet.

public class np2 extends Frame implements ActionListener
{
	MenuBar mnu;
	Menu File,Edit,View,Help;
	MenuItem New,Open,Save,Close,Copy,Paste,Status;
	TextArea Content;
	public np2()
	{
		mnu  =new MenuBar();
		setMenuBar(mnu);
		File = new Menu("File");
		Edit = new Menu("Edit");
		View = new Menu("View");
		Help = new Menu("Help");
		New = new MenuItem("New");
		Open = new MenuItem("Open");
		Save = new MenuItem("Save");
		Close  = new MenuItem("Close");
		Copy = new MenuItem("Copy");
		Paste = new MenuItem("Close");	
		File.add(New);
		File.add(Open);
		File.add(Save);
		File.add(new MenuItem("-"));
		File.add(Close);
		
		Edit.add(Copy);
		Edit.add(Paste);
		Status = new MenuItem("Status Bar");
		View.add(Status);
		Status.setEnabled(false);
		New.addActionListener(this);
		Open.addActionListener(this);
		Save.addActionListener(this);
		Close.addActionListener(this);

		mnu.add(File);
		mnu.add(Edit);
		mnu.add(View);
		mnu.add(Help);
		
		Content = new TextArea();		
		
		add(Content);	
		setSize(300,300);
		setVisible(true);
		setTitle("Un Titled - NOtepad ");
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==New)
		{
			Content.setText("");
			try
			{
			BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
	
			String Str = Br.readLine();
			System.out.println("Your Name  "  + Str);	
			String Str1 = Br.readLine();
			System.out.println("Your Name  "  + Str1);
			}
			catch(Exception e3)
			{
			System.out.println("\n Error " +e3);
			}
		}
		else if(e.getSource()==Open)
		{
			FileDialog Fd = new FileDialog(this,"Open File",FileDialog.LOAD);
			Fd.setVisible(true);

		String Name=  Fd.getDirectory()+ Fd.getFile();
		try
		{
			InputStream in = new FileInputStream(Name);
			int ch;
			String st="";
			Content.setText("");
			while((ch=in.read())!=-1)
			{
				st=st+(char)ch;
			}
			Content.append(st);

			in.close();
		}catch(Exception e1)
			{
		System.out.println("Error " + e1);
			}

		
		}
		else if(e.getSource()==Save)
		{
		FileDialog Fd = new FileDialog(this,"Open File",FileDialog.SAVE);
			try
			{	
			OutputStream Out = new FileOutputStream("hello.txt");
			String Msg=Content.getText();
	
			byte buf[] = Msg.getBytes();
			Out.write(buf);
			Out.close();
			}
			catch(Exception e2)
			{
				System.out.println("Error  " + e2);
			}	
				Fd.setVisible(true);
		}
		else if (e.getSource()==Close)
		{
			dispose();
		}
	}

	public static void main(String ar[])
	{
		new np2();
	}
}