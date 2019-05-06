/*	Write a java program to create two packages. In first package create employee class with
	employee number, name & salary. In second package create a class manager which is
	subclass of employee class having fields as department name & incentive. Create main
	class which will import these packages & display gross salary. * 
 */
import p1.Employee;
import p2.Manager;

public class Program7 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp[] = new Employee[5];
		for(int i=0; i<3; i++)
		{
			emp[i] = new Employee();
			emp[i].setData();
		}
		for(int i=3; i<5; i++)
		{
			emp[i] = new Manager();
			emp[i].setData();
		}
		for(int i=0; i<5; i++)
			emp[i].display();
		
	}

}
