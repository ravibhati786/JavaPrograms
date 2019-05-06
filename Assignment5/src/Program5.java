/*	Write a program to create Menu Color on menu bar containing items Red, Green, Blue, Black in color. 
 * 	Depending on which menu item was selected the background color of the frame window is set to that color.
 */

import java.awt.*;
import java.awt.event.*;
public class Program5 implements ActionListener, WindowListener  {
	Frame F;
	MenuBar mb;
	Menu menu; 
	MenuItem i1,i2,i3,i4; 
	Program5()
	{
		
		F = new Frame("Menu and MenuItem Example");
		
		mb = new MenuBar();
		menu = new Menu("Color");
		i1 = new MenuItem("Red");
		i2 = new MenuItem("Green");
		i3 = new MenuItem("Blue");
		i4 = new MenuItem("Black");
		
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		menu.add(i4);
		mb.add(menu);
		F.setMenuBar(mb);
		F.setSize(400,400);
		F.setLayout(null);
		F.setVisible(true);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		i3.addActionListener(this);
		i4.addActionListener(this);
		
		F.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowevent){
				System.exit(0);
			}
		});
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == i1)
			F.setBackground(Color.red);
		else if(e.getSource() == i2)
			F.setBackground(Color.green);
		else if(e.getSource() == i3)
			F.setBackground(Color.blue);
		else if(e.getSource() == i4)
			F.setBackground(Color.black);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program5();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		F.dispose();
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
