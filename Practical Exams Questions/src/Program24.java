/*	Write a JDBC application using swing for the following:
 */

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class Program24 extends JFrame implements ActionListener {
	JLabel lbl;
	JTextField tf;
	JButton add,alter,drop;
	static String url = "jdbc:odbc:StudentDemo";
	Connection con;
	Statement stm;
	String query;
	Program24()
	{
		lbl = new JLabel("Type DDL Query ="); lbl.setBounds(10,20,100,30);
		tf = new JTextField(); tf.setBounds(130,20,200,30);
		
		add = new JButton("Add Table"); add.setBounds(10, 70, 100, 30);
		alter = new JButton("Alter Table"); alter.setBounds(120,70,100,30);
		drop = new JButton("Drop Table"); drop.setBounds(230,70,100,30);
		
		add(tf); add(lbl);
		add(add); add(alter); add(drop);
		setSize(400,200);
		setLayout(null);
		setVisible(true);
		
		add.addActionListener(this);
		alter.addActionListener(this);
		drop.addActionListener(this);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program24();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add)
		{
			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con = DriverManager.getConnection(url);
				stm = con.createStatement();
				query =tf.getText();
				int result = stm.executeUpdate(query);
				if(result ==0)
					JOptionPane.showMessageDialog(null, "Table Created");
				else
					JOptionPane.showMessageDialog(null, "Table Not Created !");
				
			}
			catch (Exception e1) {
				// TODO: handle exception
				System.out.println(e1);
			}
		}
		if(e.getSource() == alter)
		{

			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con = DriverManager.getConnection(url);
				stm = con.createStatement();
				query =tf.getText();
				int result = stm.executeUpdate(query);
				if(result ==0)
					JOptionPane.showMessageDialog(null, "Table Altered");
				else
					JOptionPane.showMessageDialog(null, "Table Not Altered !");
				
			}
			catch (Exception e1) {
				// TODO: handle exception
				System.out.println(e1);
			}
		}
		if(e.getSource() == drop)
		{

			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con = DriverManager.getConnection(url);
				stm = con.createStatement();
				query =tf.getText();
				int result = stm.executeUpdate(query);
				if(result ==0)
					JOptionPane.showMessageDialog(null, "Table Dropped");
				else
					JOptionPane.showMessageDialog(null, "Table Not Dropped !");
				
			}
			catch (Exception e1) {
				// TODO: handle exception
				System.out.println(e1);
			}
	
		}
	}

}
