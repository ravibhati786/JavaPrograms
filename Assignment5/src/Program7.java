//	Write a java code to draw line & display co-ordinates according to mouse move.

import java.awt.*;
import java.awt.event.*;

public class Program7 implements MouseMotionListener {

	Frame f;
	Label l;
	Program7()
	{
		f = new Frame("Mouse Example");
		f.addMouseMotionListener(this);
		
		l = new Label();
		l.setBounds(300,300,130,100);
		
		f.add(l);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowevent){
				System.exit(0);
			}
		});
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program7();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText(e.getX() + " " + e.getY());
		Graphics g = f.getGraphics();
		g.setColor(Color.blue);
		g.drawLine(e.getX(), e.getY(), e.getX(), e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		}
}