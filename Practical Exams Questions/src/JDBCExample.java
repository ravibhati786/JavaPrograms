import java.sql.*;
import java.lang.*;
import java.util.Scanner;

public class JDBCExample {

	   static final String DB_URL = "jdbc:odbc:StudentDemo";
	   
	   static  int count=0;
	   

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		   Connection conn = null;
		   Statement stmt = null;
		   
		   try{
		
			  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			  conn = DriverManager.getConnection(DB_URL);
			  stmt = conn.createStatement();
			  String sql;
			  ResultSet rs=null;
			  sql = "SELECT * FROM Student";
				rs = stmt.executeQuery(sql);
			  while(rs.next()){
					int id  = rs.getInt(1);
					String name = rs.getString(2);
					int number = rs.getInt(3);

					System.out.println(id + "\t" + name + "\t" + number);
					System.out.println();
			  }
		   }catch(SQLException se){
				  se.printStackTrace();
			   }
	 
	}

}
  
