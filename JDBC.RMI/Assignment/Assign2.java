import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Assign2 extends JFrame implements ActionListener
{
	JMenuBar mnu;
	JMenu File;
	JMenuItem New,Open,Save,Close;
	JTextField FileName;
	public Assign2()
	{	
		setLayout(new FlowLayout(FlowLayout.CENTER));
		mnu = new JMenuBar();
		New= new JMenuItem("New");
		Open= new JMenuItem("Open");
		Save= new JMenuItem("Save");
		Close = new JMenuItem("Close");
		File = new JMenu("File");
		mnu.add(File);
		FileName = new JTextField(20);
		setJMenuBar(mnu);
		File.add(New);
		File.add(Open);
		Open.addActionListener(this);
		File.add(Save);
		File.add(Close);
	
		add(FileName);
		setSize(300,400);
		setVisible(true);
		setTitle("Assignment 2 ");	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==Open)
		{
		JFileChooser Jf= new JFileChooser();
		Jf.showOpenDialog(this);
		FileName.setText(Jf.getSelectedFile().toString());
		}
	}
	public static void main(String ar[])
	{
		Assign2 A= new Assign2();		
	}
}