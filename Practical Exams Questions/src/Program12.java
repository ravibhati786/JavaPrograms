/*	Write the program to display names of plants in a combo box and 
 	display the names of selected plant in a text fields.
 */
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class Program12 implements ItemListener {
	JFrame f;
	JComboBox cb;
	JTextField tf;
	Program12()
	{
		f = new JFrame("ComboBox Example");
		String plants[] = {"Grass","Weed","Corn","Tree","Flowers"};
		cb = new JComboBox(plants);
		cb.setBounds(20, 20, 100, 30);
		
		tf = new JTextField();
		tf.setBounds(20, 120, 100, 30);
		
		f.add(tf);
		f.add(cb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		cb.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program12();
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		tf.setText(cb.getSelectedItem().toString());
	}

}
