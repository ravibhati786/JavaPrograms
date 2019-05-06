/*	Write the java program to connect the database using JDBC to find employee with highest salary. 
	Consider the table : Employee (Empno, Empname, Empdesignation, Empsalary).
 */
import java.sql.*;

public class Program10 {

	static String url = "jdbc:odbc:StudentDemo";
	public void find() throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection(url);
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("Select * from Employee where EmpSalary = (Select max(EmpSalary) from Employee)");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
	}
	
	public static void main(String args[])
	{
		Program10 p = new Program10();
		try{
			p.find();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
