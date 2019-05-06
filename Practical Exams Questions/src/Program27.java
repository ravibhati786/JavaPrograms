/*	Write a class student with name and marks, if name contains digits raise user-defined 
 	exception “Name not valid ” and throw it.
 */
class NameNotValid extends Exception
{
	public NameNotValid(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
class Student
{
	String name;
	int marks;
	void setData(String s, int m) throws NameNotValid
	{
		int digit =0;
		char ch[] = s.toCharArray();
		for(char c: ch)
		{
			if(Character.isDigit(c))
			{
				digit++;
			}
		}
		if(digit ==0)
		{
			System.out.println("Perfect! Values are stored.");
			name = s;
			marks = m;
		}
		else
		{
			throw new NameNotValid("Name not Valid!");
		}
	}
}
public class Program27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		try{
		s.setData("Ravi",234);
		}
		catch(NameNotValid e)
		{
			System.out.println(e);
		}
	}

}
