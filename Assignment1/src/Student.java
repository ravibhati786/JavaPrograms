import java.util.Scanner;

//Define a student class(rollnumber,name,percentage).
//define a default and parameterized constructor. Keep a count of objects created.
//Create objects using paramerterized constructor and display the object count after each
//object is created. (Use static member and method). Also display the contents of each object.
public class Student {
	static int count = 0;
	int rollNumber;
	String name;
	float percentage;
	
	Student()
	{
		count++;
		this.rollNumber = 0;
		this.name = "Name";
		this.percentage = 0;
		
	}
	Student(int roll, String name, float perc)
	{
		count++;
		this.rollNumber = roll;
		this.name = name;
		this.percentage = perc;
	}
	
	void Display()
	{
		System.out.println(rollNumber+" "+name+" "+percentage+"%");
	}
	
	void setData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Name =");
		this.name = in.nextLine();
		System.out.println("Enter the RollNumber =");
		this.rollNumber = in.nextInt();
		System.out.println("Enter the Percentage =");
		this.percentage = in.nextFloat();
		
		
	}
	
	static void sortStudent(Student obj[])
	{
		for(int i =1; i<=obj.length-1; i++)
		{
			for(int j =0; j<obj.length-i; j++)
			{
				if(obj[j].percentage > obj[j+1].percentage)
				{
					Student temp = obj[j];
					obj[j] = obj[j+1];
					obj[j+1] = temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inv = new Scanner(System.in);
		System.out.println("Enter the number of Students = ");
		int n = inv.nextInt();
		Student []std = new Student[n];
		
		for(int s=0; s<std.length; s++ )
		{
			std[s] = new Student();
			std[s].setData();
		}
		/*std[0] = new Student(10,"Ravi",88);
		std[1] = new Student(9,"Kanchan",84);
		std[2] = new Student(8,"Hitesh",83);
		std[3] = new Student(7,"Lokesh",80);
		std[4] = new Student(6,"Prashant",65);
		*/
		
		for(int s=0; s<std.length; s++)
		{
			std[s].Display();
		}
		System.out.println("Number of Students = "+Student.count);
		
		sortStudent(std);
		
		for(int s=0; s<std.length; s++)
		{
			std[s].Display();
		}
	}

}
