/*	Write a Java program to create a menu same as notepad. File –New, Open, Save, Save As, and Exit. Edit –Cut, Copy, and Paste.
 */

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.*;

public class Program6{
	
	Frame f;
	MenuBar mb;
	Menu file, edit;
	MenuItem newf,open,save,saveas, exit;
	MenuItem cut,copy,paste;
	
	Program6()
	{
		f = new Frame("MenuBar like Notepad");
		mb = new MenuBar();
		file = new Menu("File");
		edit = new Menu("Edit");
		newf = new MenuItem("New");
		open = new MenuItem("Open");
		save = new MenuItem("Save");
		saveas = new MenuItem("Save As");
		exit = new MenuItem("Exit");
		cut = new MenuItem("Cut");
		copy = new MenuItem("Copy");
		paste = new MenuItem("Paste");
		mb.add(file);
		mb.add(edit);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowevent)
			{
				System.exit(0);
			}
		});
		
		file.add(newf);
		file.add(open);
		file.add(save);
		file.add(saveas);
		file.add(exit);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		f.setMenuBar(mb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program6();
	}

}
