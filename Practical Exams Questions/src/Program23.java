/*	Write a java program to accept n employee information (id, name) and store into Hashtable. 
	Display all employee details
 */
import java.io.*;
import java.util.*;
public class Program23 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> employee = new Hashtable<Integer, String>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number =");
		int n = in.nextInt();
		String name = "";
		int id;
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter id =");
			id = in.nextInt();
			System.out.println("Enter name =");
			name = in.next();
			employee.put(id, name);
		}
		Enumeration num;
		num = employee.keys();
		while(num.hasMoreElements())
		{
			id = (Integer) num.nextElement();
			name = employee.get(id);
			System.out.println(id+" "+name);
		}
		
	}

}
