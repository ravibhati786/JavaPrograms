/*	Write a program in java to create a screen which contains three checkboxes (.net, php, java) 
	and displays the selected items in a textbox.
 */

import java.awt.*;
import java.awt.event.*;
public class Program18 extends Frame implements ItemListener{
	
	Checkbox chk1,chk2,chk3;
	TextField tf;
	Program18()
	{
		chk1 = new Checkbox(".Net");
		chk2 = new Checkbox("PHP");
		chk3 = new Checkbox("Java");
		chk1.setBounds(30,50,40,30);
		chk2.setBounds(90,50,40,30);
		chk3.setBounds(150,50,40,30);
		
		tf = new TextField();
		tf.setBounds(40, 100, 150, 30);
		
		add(chk1);add(chk2);add(chk3);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program18();
	}

	public String evaluate()
	{
		String s =" ";
		if(chk1.getState() == true)
			s+= chk1.getLabel()+" ";
		if(chk2.getState() == true)
			s+= chk2.getLabel()+" ";
		if(chk3.getState() == true)
			s+= chk3.getLabel();
		return s;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == chk1)
			tf.setText(evaluate());
		if(e.getSource() == chk2)
			tf.setText(evaluate());
		if(e.getSource() == chk3)
			tf.setText(evaluate());
	}

}
