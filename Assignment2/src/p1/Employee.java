package p1;

import java.util.Scanner;

public class Employee {
	int emp_num;
	String emp_name;
	protected float emp_salary;
	
	public Employee()
	{
		emp_num = 0;
		emp_name = "";
		emp_salary = 0;
	}
	public Employee(int id, String name, float sal)
	{
		emp_num = id;
		emp_name = name;
		emp_salary = sal;
	}
	
	public void setData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Emp_Number =");
		emp_num = in.nextInt();
		System.out.println("Enter the Emp_Name =");
		emp_name = in.next();
		System.out.println("Enter the Emp_Salary =");
		emp_salary = in.nextFloat();
	}
	public void display()
	{
		System.out.println(emp_num+" "+emp_name+" "+emp_salary);
	}
}
