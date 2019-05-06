/* Write a java program to display different books along with price of the books using the listbox1 
 * and transfer the selected books to listbox2. On Click of button display the total price of selected books in textbox.
*/
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

import java.util.Map.Entry;


public class Program4 extends Frame implements WindowListener, ActionListener {
	List l1, l2;
	Button add, remove, btn_dis;
	int id;
	TextField tf_price;
	Label total;
	float pricetotal;
	HashMap<String,Integer> book_price = new HashMap<String,Integer>();
	
	Program4()
	{
		book_price.put("CPP", 300);
		book_price.put("DBMS", 400);
		book_price.put("Java", 500);
		book_price.put("DevOps", 600);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent windowevent){
				System.exit(0);
			}
		});
		l1 = new List();
		l2 = new List();
		add = new Button("->");
		remove = new Button("<-");
		tf_price = new TextField();
		total = new Label("Total Price :");
		btn_dis = new Button("Display Total");
		pricetotal = 0;
		btn_dis.setBounds(130,250,100,30);
		tf_price.setBounds(160,300,100,30);
		total.setBounds(90,300,100,30);
		l1.setBounds(40,100,100,100);
		l2.setBounds(200,100,100,100);
		add.setBounds(160,110,20,20);
		remove.setBounds(160,150,20,20);
		for(Entry<String, Integer> m: book_price.entrySet())
		{
			l1.add(m.getKey()+" "+ m.getValue());
		}
		add(l1);
		add(l2);
		add(add);
		add(remove);
		add(tf_price);
		add(total);
		add(btn_dis);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		add.addActionListener(this);
		remove.addActionListener(this);
		btn_dis.addActionListener(this);
		
	}
	
	public float getPrice(String s)
	{
		String []sp = s.split(" ");

		float p = Float.parseFloat(sp[1]);
		
		return p;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add)
		{
			if(l1.getSelectedItem() != null)
			{
				l2.add(l1.getSelectedItem());
				float p = getPrice(l1.getSelectedItem().toString());
				pricetotal += p;
				l1.remove(l1.getSelectedItem());	
				
			}
			
		}
		else if(e.getSource() == remove)
		{
			if(l2.getSelectedItem() != null)
			{
				l1.add(l2.getSelectedItem());
				float p = getPrice(l2.getSelectedItem().toString());
				pricetotal -= p;
				l2.remove(l2.getSelectedItem());
			}
		}
		else if(e.getSource()== btn_dis)
		{
			tf_price.setText(Float.toString(pricetotal));
		
		}
	}
	
	
	public static void main(String args[])
	{
		Program4 p = new Program4();
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
		dispose();
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
