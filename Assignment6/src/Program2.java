import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
/*
 Write a program to accept empno & update a file emp.dat
 */

public class Program2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Employee Number :");
		int num = in.nextInt();
		/*Employee emp = new Employee(2, "Kanu", 50000);
		FileOutputStream fout = new FileOutputStream("D:\\java prog\\Files\\ravi.dat");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(emp);
		out.flush();
		System.out.println("Success");
		*/
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("D:\\java prog\\Files\\ravi.dat"));
		Employee emp1 = (Employee)oin.readObject();
		System.out.println(emp1.empno+" "+emp1.empname+" "+emp1.empsal);
		System.out.println("Ente the salary to update: ");
		int sal = in.nextInt();
		emp1.empsal = sal;
		
		FileOutputStream fout = new FileOutputStream("D:\\java prog\\Files\\ravi.dat");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(emp1);
		out.flush();
		
		ObjectInputStream oin2 = new ObjectInputStream(new FileInputStream("D:\\java prog\\Files\\ravi.dat"));
		Employee emp2 = (Employee)oin2.readObject();
		System.out.println(emp2.empno+" "+emp2.empname+" "+emp2.empsal);
		
		
		oin.close();
		//out.close();
		//fout.close();
	}

}
