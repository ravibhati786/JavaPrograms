package p2;
import java.util.Scanner;

import p1.Employee;
public class Manager extends Employee {
	String dept_name;
	float incentive;
	float totalSal;
	
	public Manager()
	{
		dept_name = "";
		incentive = 0;
	}
	public Manager(int id, String name, float sal, String dept, float incen)
	{
		super(id,name,sal);
		dept_name = dept;
		incentive = incen;
	}
	
	public void setData()
	{
		super.setData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Emp_Dept =");
		dept_name = in.next();
		System.out.println("Enter the Emp_Incentives =");
		incentive = in.nextFloat();
		totalSal = incentive + emp_salary ;
	}
	public void display()
	{
		super.display();
		System.out.print(dept_name+" "+incentive+" "+totalSal);
	}
}
