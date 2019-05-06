/* Create Person class with data members as person_id & name. Derive two classes Student & Faculty from it.
 * The fields of Student are course name & fees paid. The fields of faculty are subject name & number of 
 * years experience. Use proper method to accept values & override display method.(Using parameterized 
 * constructor).
 */

class Person
{
	int person_id;
	String name;
	
	Person(int id, String name)
	{
		this.person_id = id;
		this.name = name;
	}
	
	void display()
	{
		System.out.print("\n"+person_id+" "+name);
	}
}
class Student extends Person
{
	String course_name;
	float fees_paid;
	
	Student(int id, String name, String cname, float fee)
	{
		super(id,name);
		this.course_name = cname;
		this.fees_paid = fee;
	}
	
	void display()
	{
		super.display();
		System.out.print(" "+course_name+" "+fees_paid);
	}
	
}
class Faculty extends Person
{
	String sub_name;
	int exp_years;
	
	Faculty(int id, String name, String sname, int exp)
	{
		super(id,name);
		this.sub_name = sname;
		this.exp_years = exp;
	}
	void display()
	{
		super.display();
		System.out.print(" "+sub_name+" "+exp_years);
	}

}
public class Program1 {
	
	public static void main(String args[])
	{
		
		Person p1 = new Person(101,"Ram");
		p1.display();		
		
		Student s1 = new Student(102,"Ravi","MCA",150000);
		s1.display();
		
		Faculty f1 = new Faculty(103,"Raj","DBMS",5);
		f1.display();
		
		
	}	
}
