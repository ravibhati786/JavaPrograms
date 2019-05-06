/*	Write a java program to display the selected employee details in JTable. (use database, combo box for 
  	employee selection ) Employee having fields eno, ename, sal, desg.
 */
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class Program28 extends JFrame implements ActionListener{
	JComboBox jcb;
	static String url = "jdbc:odbc:StudentDemo";
	Connection con;
	Statement stm;
	ResultSet rs;
	Vector columnNames = new Vector();
	Vector data = new Vector();
	
	Program28()
	{
		super("Employee Selection");
		jcb = new JComboBox();
		jcb.setBounds(20, 20, 80, 30);
		try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		con = DriverManager.getConnection(url);
		stm = con.createStatement();
		rs = stm.executeQuery("Select EmpName from Employee");
		while(rs.next())
		{
			jcb.addItem(rs.getString(1));
		}
		con.close();
		stm.close();
		
		}
		catch(Exception e){e.printStackTrace();}
		add(jcb);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		jcb.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			columnNames.clear();
			data.clear();
			String str = jcb.getSelectedItem().toString();
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection(url);
			stm = con.createStatement();
			rs = stm.executeQuery("Select * from Employee where EmpName = '"+str+"'");
			ResultSetMetaData rsmd = rs.getMetaData();
			int col = rsmd.getColumnCount();
			for(int i=1; i<=col;i++)
			{
				columnNames.addElement(rsmd.getColumnName(i));
			}
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
			JTable jt = new JTable(data,columnNames);
			JScrollPane pane = new JScrollPane(jt);
			pane.setBounds(20, 50, 300, 200);
			add(pane);
			
			con.close();
			stm.close();
		}
		catch(Exception e1)
		{
			System.out.println(e1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program28();
	}

}
