/*	Write the java program to connect the database using to find student with highest total marks. 
 	Consider the table: Student( rollno, name, s1_marks,s2_marks,s3_marks)
 */
import java.sql.*;
public class Program16 {
	static String url = "jdbc:odbc:StudentDemo";
	public void find() throws Exception
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection(url);
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery("Select * from Student1 where s1_marks+s2_marks+s3_marks = (Select Max(s1_marks+s2_marks+s3_marks) from Student1)");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program16 p = new Program16();
		try
		{
			p.find();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
