/*	Write a java program to accept the details of college (CID, CName, Address, year) and 
 * 	store it into database (Use Swing and PreparedStatement interface)
 */

import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class Program32 extends JFrame implements ActionListener{
	JLabel lblid,lblname,lbladd,lblyear;
	JTextField cid,cname,cadd,cyear;
	JButton jbtninsert,jbtndisplay;
	Connection con;
	PreparedStatement pstm;
	static String url = "jdbc:odbc:StudentDemo";
	Program32()
	{
		super("College Details");
		lblid = new JLabel("Enter College ID = "); lblid.setBounds(10, 10, 140, 30);
		lblname = new JLabel("Enter College Name = "); lblname.setBounds(10, 40, 140, 30);
		lbladd = new JLabel("Enter College Address = "); lbladd.setBounds(10, 70, 140, 30);
		lblyear = new JLabel("Enter College Year = "); lblyear.setBounds(10, 100, 140, 30);
		
		cid = new JTextField(); cid.setBounds(160,10,130,30);
		cname = new JTextField(); cname.setBounds(160,40,130,30);
		cadd = new JTextField(); cadd.setBounds(160,70,130,30);
		cyear = new JTextField(); cyear.setBounds(160,100,130,30);
		
		jbtninsert = new JButton("Insert"); jbtninsert.setBounds(140,150,80,40);
		jbtndisplay = new JButton("Display"); jbtndisplay.setBounds(40,150,80,40);
		
		add(lblid);add(lblname);add(lbladd);add(lblyear);
		add(cid);add(cname);add(cadd);add(cyear);
		add(jbtninsert); add(jbtndisplay);
		setLayout(null);
		setSize(400,500);
		setVisible(true);
		
		jbtninsert.addActionListener(this);
		jbtndisplay.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == jbtninsert)
		{
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con = DriverManager.getConnection(url);
				pstm = con.prepareStatement("Insert into College values(?,?,?,?)");
				pstm.setString(1, cid.getText());
				pstm.setString(2, cname.getText());
				pstm.setString(3, cadd.getText());
				pstm.setString(4, cyear.getText());
				int result = pstm.executeUpdate();
				if(result == 0)
					JOptionPane.showMessageDialog(null, "Row Inserted Successfully!");
				else
					JOptionPane.showMessageDialog(null, "Row Not Inserted!");
				
				con.close();
				pstm.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		if(e.getSource() == jbtndisplay)
		{
			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				con = DriverManager.getConnection(url);
				Statement stm = con.createStatement();
				ResultSet rs = stm.executeQuery("Select * from College");
				ResultSetMetaData rsmd = rs.getMetaData();
				int col = rsmd.getColumnCount();
				Vector columnNames = new Vector();
				Vector data = new Vector();
				for(int i=1; i<=col; i++)
					columnNames.addElement(rsmd.getColumnName(i));
				while(rs.next())
				{
					Vector row = new Vector();
					for(int i=1; i<=col; i++)
					{
						row.addElement(rs.getObject(i));
					}
					data.addElement(row);
				}
				JTable table = new JTable(data,columnNames);
				JScrollPane pane = new JScrollPane(table);
				pane.setBounds(20,200,360,200);
				add(pane);
				con.close();
				stm.close();
			}
			catch(Exception ex)
			{
				
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Program32();
	}
}
