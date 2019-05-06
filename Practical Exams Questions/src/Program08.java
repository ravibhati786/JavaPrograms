/*	Write a java program to create an Applet which contains a list of courses. 
 * 	Display the selected course in a text box.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class Program08 extends Applet implements ItemListener {

	List l;
	TextField tf;
	public void init()
	{
		l = new List(5);
		l.setBounds(20, 20, 100, 200);

		tf = new TextField();
		tf.setBounds(20, 250, 100, 30);
		
		l.add("MCA");
		l.add("BCA");
		l.add("BSC");
		l.add("MBA");
		l.add("BBA");
		add(tf);
		add(l);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		l.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		tf.setText(l.getSelectedItem());
	}

}
