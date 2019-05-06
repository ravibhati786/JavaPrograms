
public class Employee {
	int Emp_id;
	String Name, Designation;
	float Salary;
	
	Employee(int id, String name, String d, float sal)
	{
		this.Emp_id = id;
		this.Name = name;
		this.Designation = d;
		this.Salary = sal;
	}
	
	void display()
	{
		System.out.println("Emp_Id\tEmp_Name\tEmp_Designation\tEmp_Salary");
		System.out.println(Emp_id+"\t"+Name+"\t"+Designation+"\t\t"+Salary);
		
	}
	
	public static void main(String args[])
	{
		Employee ob = new Employee(12,"Ravi","Engineer",30000);
		ob.display();
	}

}
