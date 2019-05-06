/*	Write a JDBC program to display all details of the student table (rollno, name, class, subject, mark). 
 * 	Also perform insertion and deletion operation on student database
 */

import java.sql.*;
public class Program04 {
	
	static String url = "jdbc:odbc:StudentDemo";
	
	Program04() throws ClassNotFoundException 
	{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	}
	public void display() throws Exception
	{
		
		Connection con = DriverManager.getConnection(url);
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("Select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
		}
		
		con.close();
	
	}
	
	public void insert(int r, String n, String c, String s, int m) throws SQLException
	{
		Connection con = DriverManager.getConnection(url);
		PreparedStatement pstm = con.prepareStatement("insert into Student values(?,?,?,?,?)");
		pstm.setInt(1, r);
		pstm.setString(2, n);
		pstm.setString(3, c);
		pstm.setString(4, s);
		pstm.setInt(5, m);
		
		int i = pstm.executeUpdate();
		System.out.println(i+ " Record inserted into Table");
		con.close();
	}
	
	public void delete(int r) throws SQLException
	{
		Connection con = DriverManager.getConnection(url);
		PreparedStatement pstm = con.prepareStatement("Delete from Student where rollNo =(?)");
		pstm.setInt(1, r);
		
		int i = pstm.executeUpdate();
		System.out.println(i+ " Record Deleted from Table");
		con.close();
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Program04 p = new Program04();
		try {
			p.display();
			//p.insert(101,"Hitesh","MCA","OT",78);
		//	p.delete(101);
			//p.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
