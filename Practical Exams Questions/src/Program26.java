/*	Write a JDBC program in java to display details of Book_Sales(SalesID,Date,Amount) 
 * 	of selected month in JTable. Book_sales table is already created. (Use JCombo component for Month selection)
 */

import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;
public class Program26 extends JFrame implements ActionListener{

	JComboBox jc;
	int str;
	Vector head = new Vector();
	Vector data = new Vector();
	Program26()
	{
		jc = new JComboBox();
		jc.setBounds(20,20,70,30);
		jc.addItem("Jan");jc.addItem("Feb");jc.addItem("Mar");jc.addItem("Apr");
		jc.addItem("May");jc.addItem("Jun");jc.addItem("Jul");jc.addItem("Aug");
		jc.addItem("Sep");jc.addItem("Oct");jc.addItem("Nov");jc.addItem("Dec");

		add(jc);
		setLayout(null);
		setSize(300,300);
		setVisible(true);
		
		jc.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program26 p = new Program26();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		str = jc.getSelectedIndex()+1;
		if(arg0.getSource() == jc)
		{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:StudentDemo");
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("Select * from Book_Sales where Month(S_Date) = "+str+"");
			
			ResultSetMetaData rsmd = rs.getMetaData();
			int col = rsmd.getColumnCount();
			for(int i=1; i<=col; i++)
			{
				head.addElement(rsmd.getColumnName(i));
				
			}
			while(rs.next())
			{
				Vector row = new Vector();
				for(int i=1; i<=col; i++)
				{
					row.addElement(rs.getObject(i));
				}
				data.addElement(row);
				
			}
			JTable jt = new JTable(data,head);
			JScrollPane pane = new JScrollPane(jt);
			pane.setBounds(20, 50, 200, 200);
			add(pane);
			con.close();
			stm.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}

	}

}
