/*	Create an applet which contains three radio buttons red, green and blue and	
 * 	change the background color to the selected color.
 */
import java.applet.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class Program20 extends Applet implements ActionListener {
	
	JRadioButton jb1, jb2, jb3;
	
	public void init()
	{
		jb1 = new JRadioButton("Red");
		jb2 = new JRadioButton("Green");
		jb3 = new JRadioButton("Blue");
		jb1.setBounds(20, 20, 60, 20);
		jb2.setBounds(90, 20, 60, 20);
		jb3.setBounds(160, 20, 60, 20);
		
		add(jb1);add(jb2);add(jb3);
		setLayout(null);
		setSize(300,300);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jb1)
			setBackground(Color.red);
		if(e.getSource() == jb2)
			setBackground(Color.green);
		if(e.getSource() == jb3)
			setBackground(Color.blue);
		
	}

}
