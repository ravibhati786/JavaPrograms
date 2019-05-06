/*	Write a program to display calculator with 
 	basic arthimetic operations (+, - , * , /) using awt and event handling
*/

import javax.swing.*;
import java.awt.event.*;

public class Program14 extends JFrame implements ActionListener{
	JLabel lbl1, lbl2, lbl3;
	JTextField tf1,tf2,tf3;
	JButton	btn1, btn2, btn3, btn4;
	Program14()
	{
		lbl1 = new JLabel("First Number :"); lbl1.setBounds(10, 20, 80, 30);
		lbl2 = new JLabel("Second Number :"); lbl2.setBounds(10, 80, 100, 30);
		lbl3 = new JLabel("Result :"); lbl3.setBounds(20, 220, 50, 30);
	
		tf1 = new JTextField(); tf1.setBounds(130, 20, 100, 30);
		tf2 = new JTextField(); tf2.setBounds(130,80,100,30);
		tf3 = new JTextField(); tf3.setBounds(70, 220, 100, 40);
		tf3.setEditable(false);
		
		btn1 = new JButton("+"); btn1.setBounds(20, 150, 50, 40);
		btn2 = new JButton("-"); btn2.setBounds(80, 150, 50, 40);
		btn3 = new JButton("*"); btn3.setBounds(140, 150, 50, 40);
		btn4 = new JButton("/"); btn4.setBounds(200, 150, 50, 40);
		
		add(lbl1); add(lbl2); add(lbl3);
		add(tf1); add(tf2); add(tf3);
		add(btn1);add(btn2);add(btn3);add(btn4);
		setLayout(null);
		setSize(300,400);
		setVisible(true);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Program14();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(tf1.getText().equals("") & tf2.getText().equals(""))
		{
			if(tf1.getText().equals(" "))
				tf1.setText("Enter Value");
			if(tf2.getText().equals(" "))
				tf2.setText("Enter Value");
		}
		else
		{
			if(e.getSource() == btn1)
			{
				tf3.setText(String.valueOf((Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText()))));
			}
			if(e.getSource() == btn2)
			{
				tf3.setText(String.valueOf((Integer.parseInt(tf1.getText())-Integer.parseInt(tf2.getText()))));
			}
			if(e.getSource() == btn3)
			{
				tf3.setText(String.valueOf((Integer.parseInt(tf1.getText())*Integer.parseInt(tf2.getText()))));
			}
			if(e.getSource() == btn4)
			{
				tf3.setText(String.valueOf((Integer.parseInt(tf1.getText())/Integer.parseInt(tf2.getText()))));
			}
		}
	}

}
