/*	Define a class Employee having private members – id, name, department, salary. Define
	default and parameterized constructors. Create a subclass called “Manager” with private
	member bonus. Define methods accept and display in both the classes. Create n objects of
	the Manager class and display the details of the manager having the maximum total
	salary (salary+bonus).
 */
import java.util.Scanner;
class Employee
{
	private int id;
	private String name;
	private String department;
	private float salary;
	Scanner in = new Scanner(System.in);
	Employee()
	{
		id = 0;
		name = "";
		department = "";
		salary = 0;
	}
	Employee(int id, String name, String department, float salary)
	{
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	void acceptData()
	{
		System.out.println("Enter the id =");
		id = in.nextInt();
		System.out.println("Enter the name =");
		name = in.next();
		System.out.println("Enter the department =");
		department = in.next();
		System.out.println("Enter the salary =");
		salary = in.nextFloat();
	}
	
	float getSalary()
	{
		return salary;
	}
	
	void display()
	{
		System.out.print("\n"+id+" "+name+" "+department+" "+salary);
	}
}
class Manager extends Employee
{
	private float bonus;
	static float totalmax;
	
	void acceptData()
	{
		super.acceptData();
		System.out.println("Enter the bonus =");
		bonus = in.nextFloat();
		if(totalmax < getSalary()+bonus)
			totalmax = getSalary()+bonus;
	}
	void display()
	{
		super.display();
		System.out.print(" "+bonus);
	}
	
	public static void disMax(Manager m[])
	{
		for(int i=0; i<m.length; i++)
		{
			if(totalmax == m[i].getSalary() + m[i].bonus)
				m[i].display();
		}
	}
	
}
public class Program6 {
	public static void main(String args[])
	{
		Manager m[] = new Manager[5];
		for(int i=0; i<m.length; i++)
		{
			m[i] = new Manager();
			m[i].acceptData();
		}
		
		for(int i=0; i<m.length; i++)
		{
			m[i].display();
		}
		
		System.out.println("The employee who has max salary:-");
		Manager.disMax(m);
				
	}
}
