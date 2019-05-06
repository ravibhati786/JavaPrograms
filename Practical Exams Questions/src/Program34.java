/*	Write a Java program to create a Package “SY” which has a class SYMarks (members – ComputerTotal, 
 	MathsTotal, and ElectronicsTotal). Create another package TY which has a classTYMarks 
 	(members – Theory, Practicals). Create n objects of Student class 
 	(having rollNumber,name, SYMarks and TYMarks). Add the marks of SY and TY computer subjects and calculate the
	Grade (‘A’ for >= 70, ‘B’ for >= 60 ‘C’ for &>= 50 , Pass Class for >=40 else ‘FAIL’) and 
	display the result of the student in proper format.(Accept the details using Swing)
 */
import java.awt.event.ActionListener;
import java.awt.event.*;
import SY.*;
import TY.*;
import javax.swing.*;
import java.util.*;
class Student1 
{
	int rollNum;
	String name;
	SYMarks sy;
	TYMarks ty;
	
	Student1(int r, String n, int sycom, int symath, int syelec, int tytheo, int typrac)
	{
		rollNum = r;
		name = n;
		sy = new SYMarks(sycom, symath, syelec);
		ty = new TYMarks(tytheo, typrac);
		
	}
	
	public void total()
	{
		System.out.print("\n"+rollNum+"\t"+name+"\t");
		int total = (sy.getTotalSY()+ty.getTotalTY())/5;
		if(total >= 70)
			System.out.print("Grade A");
		else if(total >= 60)
			System.out.print("Grade B");
		else if(total >= 50)
			System.out.print("Grade C");
		else if(total >= 40)
			System.out.print("Grade Pass");
		else
			System.out.print("Fail");
	}
	
}
public class Program34 extends JFrame implements ActionListener{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JButton btn;
	
	Student1[] student;
	int count = 0;
	Program34(int n)
	{
		super("Enter the Student Details!");
		student = new Student1[n];
		l1 = new JLabel("Enter Roll Number :"); l1.setBounds(10,10,130,30);
		t1 = new JTextField(); t1.setBounds(130, 10, 80, 30);
		
		l2 = new JLabel("Enter Name :"); l2.setBounds(240,10,80,30);
		t2 = new JTextField(); t2.setBounds(320,10,120,30);
		
		l3 = new JLabel("SYMarks =>"); l3.setBounds(10,50,70,30);
		l4 = new JLabel("ComputerTotal :"); l4.setBounds(10,70,100,30);
		t3 = new JTextField(); t3.setBounds(105,70,40,30);
		
		l5 = new JLabel("MathsTotal :"); l5.setBounds(170,70,100,30);
		t4 = new JTextField(); t4.setBounds(240,70,40,30);
		
		l6 = new JLabel("ElectronicsTotal :"); l6.setBounds(300,70,100,30);
		t5 = new JTextField(); t5.setBounds(400,70,40,30);
		
		l7 = new JLabel("TYMarks =>"); l7.setBounds(10,120,70,30);
		l8 = new JLabel("Theory :"); l8.setBounds(10,150,60,30);
		t6 = new JTextField(); t6.setBounds(60,150,40,30);
		
		l9 = new JLabel("Practicals :"); l9.setBounds(120,150,80,30);
		t7 = new JTextField(); t7.setBounds(200,150,40,30);
		
		btn = new JButton("Save"); btn.setBounds(30,200,70,40);
		
		add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);
		add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);add(btn);
		setSize(500,300);
		setLayout(null);
		setVisible(true);
		
		btn.addActionListener(this);
	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(count < student.length)
		{
			int rollNum = Integer.parseInt(t1.getText());
			String name = t2.getText();
			int sycom = Integer.parseInt(t3.getText());
			int symaths = Integer.parseInt(t4.getText());
			int syelec = Integer.parseInt(t5.getText());
			int tytheory = Integer.parseInt(t6.getText());
			int typract = Integer.parseInt(t7.getText());
			
			student[count] = new Student1(rollNum, name, sycom, symaths, syelec, tytheory, typract);
			student[count].total();
			
			t1.setText("");t2.setText("");t3.setText("");t4.setText("");t5.setText("");t6.setText("");t7.setText("");
			count ++;
			
		}
		else
		{
			dispatchEvent(new WindowEvent(this,WindowEvent.WINDOW_CLOSING));
			//display();
		}
		
	}
	
	void display()
	{
		for(int i=0; i<student.length; i++)
		{
			student[i].total();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Student =");
		int n= in.nextInt();
		Program34 p = new Program34(n);
		//p.display();
	}

}
