/*	Write a java program for implementation scrollable ResultSet. Consider Emp table(eno, ename, sal)
	- moveFirst
	- moveNext
	- movePrevious
 */
import java.sql.*;
import java.util.*;
public class Program30 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:StudentDemo");
			Statement stm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stm.executeQuery("Select * from EmpTable");
			for(;;)
			{
				System.out.println("Please Enter 1 for Next:-");
				System.out.println("Please Enter 2 for Previous:-");
				System.out.println("Please Enter 3 for First:-");
				System.out.println("Please Enter 4 for Last:-");
				System.out.println("Please Enter 5 for Exit:-");
				Scanner in = new Scanner(System.in);
				int choice = in.nextInt();
				switch(choice)
				{
				case 1:	System.out.println("Display Next Record:");
						rs.next();
						System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
						break;
				case 2: System.out.println("Display Previous Record:");
						rs.previous();
						System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
						break;
				case 3:	System.out.println("Display First Record:");
						rs.first();
						System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
						break;
				case 4: System.out.println("Display Last Record:");
						rs.last();
						System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
						break;
				case 5:	System.exit(0);
						break;
				}
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
