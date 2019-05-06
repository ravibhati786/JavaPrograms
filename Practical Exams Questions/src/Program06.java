/*	Write the JDBC program to accept the student information (id, name, Address) from the user and 
 * 	insert it into the student table and display all information which is inserted when clicked on show button using swing.
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;

import java.util.*;

public class Program06 extends JFrame implements ActionListener {
	JLabel lid, lname, ladd;
	JTextField id, name, add;
	JButton insert, show;
	//JTable table;
	static String url = "jdbc:odbc:StudentDemo";
	
	Vector columnNames = new Vector();
	Vector data = new Vector();
	
	Program06()
	{
		super("JDBC Student");
		lid = new JLabel("Id");	lname = new JLabel("Name"); ladd = new JLabel("Address");
		id = new JTextField(); name = new JTextField();	add = new JTextField();
		
		lid.setBounds(25,15,80,30); lname.setBounds(115, 15, 80, 30); ladd.setBounds(215, 15, 80, 30);
		
		id.setBounds(20,40,80,30); name.setBounds(110, 40, 80, 30); add.setBounds(210, 40, 80, 30);
		
		insert = new JButton("Insert");	insert.setBounds(25, 80, 100, 30);
		
		show = new JButton("Show");	show.setBounds(150, 80, 100, 30);
		
		//table = new JTable(data,columnNames);
		//table.setBounds(20, 150, 200, 200);
		
		add(lid);add(lname);add(ladd);
		add(id);add(name);add(add);
		add(insert);add(show);
		//add(table);
		
		insert.addActionListener(this);
		show.addActionListener(this);
		
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program06();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == insert)
		{
			if(id.getText().equals("") | name.getText().equals("") | id.getText().equals(" "))
			{
				return;
			}
			else
			{
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection con = DriverManager.getConnection(url);
					PreparedStatement pstm = con.prepareStatement("Insert into Student1 values(?,?,?)");
					pstm.setString(1, id.getText());
					pstm.setString(2, name.getText());
					pstm.setString(3, add.getText());
					
					int i = pstm.executeUpdate();
					System.out.println(i+" record inserted.");
					
					con.close();
					pstm.close();
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource() == show)
		{
			try
			{
				data.clear();
				columnNames.clear();
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				Connection con = DriverManager.getConnection(url);
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("Select * from Student1");
				ResultSetMetaData rsmd = rs.getMetaData();
				
				int col = rsmd.getColumnCount();
				
				//Get columns name
				for(int i=1; i<=col; i++)
				{
					columnNames.addElement(rsmd.getColumnName(i));
				}
				
				//get row data
				while(rs.next())
				{
					Vector row = new Vector();
					for(int i=1; i<=col; i++)
					{
						row.addElement(rs.getObject(i));
					}
					data.addElement(row);
					System.out.println(row);
				}
				con.close();
				stm.close();
				JTable table = new JTable(data,columnNames);
				JScrollPane pane = new JScrollPane(table);
				pane.setBounds(20,150,300, 200);
				add(pane);

			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
			
		}
	}

}
