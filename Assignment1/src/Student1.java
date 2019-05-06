/* Q.14 Write a Java program to create a Package "SY" which has a class SYMarks(members - computerTotal,
 * mathsTotal, and electronicsTotal). Create another package TY which has a class TYMarks(members - 
 * Theory, Practicals). Create n objects of Student class(having rollNumber, name, SYMarks and TYMarks).
 * Add the marks of SY and TY computer subjects and calculate the Grade('A' for >= 70, 'B' for >= 60,
 * 'C' for >= 50, Pass Class for >=40 else 'FAIL') and display the result of the student in proper format.
 */
import SY.SYMarks;
import TY.TYMarks;
import java.util.Scanner;
public class Student1 {

	int rollNumber;
	String name;
	String grade;
	SYMarks sym; TYMarks tym;
	
	Student1()
	{
		rollNumber = 0;
		name = "";
		sym = new SYMarks();
		tym = new TYMarks();
		grade = "";
	}
	
	void setData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Roll Number = ");
		rollNumber = in.nextInt();
		System.out.println("Enter the Name = ");
		name = in.next();
		sym.setMarks();
		tym.setMarks();
		setGrade();
	}
	
	void setGrade()
	{
		float total = ((sym.getTotal()+tym.getTotal())/5);
		if(total >= 70)
			grade = "A";
		else if(total >= 60)
			grade = "B";
		else if(total >= 50)
			grade = "C";
		else if(total >= 40)
			grade = "PASS";
		else
			grade = "FAIL";
	}
	
	void display()
	{
		System.out.println(rollNumber+" "+name+" "+grade);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Students =");
		int n = in.nextInt();
		Student1 s[] = new Student1[n];
		
		for(int i =0; i<s.length; i++)
		{
			s[i] = new Student1();
			s[i].setData();
		}
		for(int i=0; i<s.length; i++)
			s[i].display();
		
	}

}
