/*	Write a class Driver with attributes vehicle no, name & age. Initialize values through parameterized constructor. If age
	of driver is less than 18 then generate user-defined exception “Age Not Within the Range”.
 */
class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
class Driver
{
	int vehicle_no;
	String name;
	int age;
	
	Driver(int vn, String name, int age) 
	{
			vehicle_no = vn;
			this.name= name;
			this.age = age;	
	}
	
	void validate() throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Age Not Within the Range!");
		}
		else
		{
			System.out.println(vehicle_no+" "+name+" "+age);
		}
	}
	
	void display()
	{
		System.out.println(vehicle_no+" "+name+" "+age);
	}
}
public class Program2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver(101,"Ravi", 11);
		try
		{
			d.validate();
		} 
		catch (InvalidAgeException m) {
			// TODO Auto-generated catch block
			System.out.println("Exception is = "+m);
		}
		d.display();
		System.out.println("hello");
	}
}
