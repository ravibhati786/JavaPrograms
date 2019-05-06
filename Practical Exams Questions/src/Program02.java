/*	Write a program to accept 2 number from user and display maximum of numbers using swing
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Program02 implements ActionListener {
	
	JFrame f;
	JButton b;
	JTextField f1,f2;
	JLabel l, lr ; 
	
	Program02()
	{
		f = new JFrame();
		b = new JButton("Show");
		b.setBounds(50, 250, 80, 30);
		f1 = new JTextField();
		f1.setBounds(20, 30, 70, 30);
		f2 = new JTextField();
		f2.setBounds(150, 30, 70, 30);
		l = new JLabel("Max Value is = ");
		l.setBounds(180, 250, 100, 30);
		lr = new JLabel();
		lr.setBounds(270, 250, 50, 30);
		f.add(b);
		f.add(f1);
		f.add(f2);
		f.add(l);
		f.add(lr);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		
		b.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program02 p = new Program02();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int v1 = Integer.parseInt(f1.getText());
		int v2 = Integer.parseInt(f2.getText());
		
		if(v1 > v2)
			lr.setText(String.valueOf(v1));
		else
			lr.setText(String.valueOf(v2));
		
	}

}
