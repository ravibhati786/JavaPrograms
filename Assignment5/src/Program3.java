//	Design a form with one textbox & 3 buttons for selecting colors. Change the textbox color depending on button click.

import java.awt.*;
import java.awt.event.*;

public class Program3 implements ActionListener, WindowListener {

	Frame f;
	Button b1,b2,b3;
	TextField tf;
	Program3()
	{
		f = new Frame();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowevent){
				System.exit(0);
			}
		});
		
		b1 = new Button("Blue");
		b1.setBounds(30,250,80,30);
		b2 = new Button("Red");
		b2.setBounds(120,250,80,30);
		b3 = new Button("Green");
		b3.setBounds(210,250,80,30);
	    tf = new TextField("Hello");
	    tf.setBounds(100,50,130,30);
	    f.add(tf);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
			 
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1)
		{
			tf.setBackground(Color.blue);
		}
		else if(e.getSource() == b2)
		{
			tf.setBackground(Color.red);
		}
		else
		{
			tf.setBackground(Color.green);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 f = new Program3();
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
		f.dispose();   
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
