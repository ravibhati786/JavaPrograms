/* 	Define an abstract class “Staff” with members name and address. Define two sub-classes of thisclass – “FullTimeStaff” (department, salary) 
 	and “PartTimeStaff” (number-of-	hours, rate-perhour). Define appropriate constructors. Create n objects which could be of either 
 	FullTimeStaff or PartTimeStaff class by asking the user’s choice. Display details of all “FullTimeStaff” objects and all “PartTimeStaff” objects.
*/
import java.util.Scanner;
abstract class Staff
{
	String name;
	String address;
	
	Staff()
	{
		name = "";
		address = "";
	}
	
	Staff(String n, String a)
	{
		name = n;
		address = a;
	}
	
	void setData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the name =");
		name = in.next();
		System.out.println("Enter the address =");
		address = in.next();
	}
	void display()
	{
		System.out.print(name +" "+address);
	}
}
class FullTimeStaff extends Staff
{
	String department;
	float salary;
	
	FullTimeStaff()
	{
		department = "";
		salary = 0;
	}
	FullTimeStaff(String name, String add, String dept, float sal)
	{
		super(name,add);
		department = dept;
		salary = sal;
	}
	
	void setData()
	{
		super.setData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the department =");
		department = in.next();
		System.out.println("Enter the salary =");
		salary = in.nextFloat();
	}
	void display()
	{
		super.display();
		System.out.println(" "+department+" "+salary);
	}
}
class PartTimeStaff extends Staff
{
	float num_of_hours;
	float rate_per_hour;
	
	PartTimeStaff()
	{
		num_of_hours = 0;
		rate_per_hour = 0;
	}
	PartTimeStaff(String name, String add, float numofhours, float rateperhour)
	{
		super(name,add);
		num_of_hours = numofhours;
		rate_per_hour = rateperhour;
	}
	
	void setData()
	{
		super.setData();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of hours =");
		num_of_hours = in.nextFloat();
		System.out.println("Enter the rate per hour =");
		rate_per_hour = in.nextFloat();
	}
	void display()
	{
		super.display();
		System.out.println(" "+num_of_hours+" "+rate_per_hour);
	}
}
public class Program8 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please the number of Staff =");
		int n = in.nextInt();
		
		Staff sf[] = new Staff[n];
		for(int i=0; i<sf.length; i++)
		{
			System.out.println("Press 1 for Full Time Staff and Press 2 for Part Time Staff =");
			int type = in.nextInt();
			if(type == 1)
			{
				sf[i] = new FullTimeStaff();
				sf[i].setData();
			}
			else if(type == 2)
			{
				sf[i] = new PartTimeStaff();
				sf[i].setData();
			}
			else
			{
				System.out.println("Wrong Choice");
			}
		}
		
		for(int i=0; i<sf.length; i++)
			sf[i].display();
	}

}
