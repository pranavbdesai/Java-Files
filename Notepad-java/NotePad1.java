import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
//Frame : it is a child window of applet.

public class NotePad1 extends Frame implements ActionListener
{
	MenuBar mnu;
	Menu File,Edit,View,Help;
	MenuItem New,Open,Save,Close,Copy,Paste,Status;
	TextArea Content;
	mywa m1;
	public NotePad1()
	{
		m1=new mywa(this);
		
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
		this.addWindowListener(m1);
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
				
				Fd.setVisible(true);
				String Name=  Fd.getDirectory()+ Fd.getFile();
				try
				{	
				OutputStream Out = new FileOutputStream(Name);
				String Msg=Content.getText();
				
	
				byte buf[] =Msg.getBytes();
				Out.write(buf);
				Out.close();
				}
				catch(Exception e3)
				{
				System.out.println("Error  " + e3);
				}	
		}
		else if (e.getSource()==Close)
		{
			dispose();
		}
	}

	public static void main(String ar[])
	{
		new NotePad1();
	}
}
class mywa extends WindowAdapter
{
	NotePad1 n1;
	mywa(NotePad1 n1)
	{
	this.n1=n1;
	}
		public void windowClosing(WindowEvent we)
		{
			System.exit(1);
		}


}