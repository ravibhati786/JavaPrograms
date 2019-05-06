/*	Define an exception called “No match Exception” that is thrown when a
	string is not equal to “India”. Write a program that uses the exception.
*/
class NoMatchException extends Exception
{
	public NoMatchException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
public class Program05 {
	
	public void validate(String s) throws NoMatchException
	{
		if(s.equals("India"))
			System.out.println("Welcome to India!");
		else
			throw new NoMatchException("Not valid String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program05 p = new Program05();
		try
		{
		p.validate("London");
		}
		catch(NoMatchException e)
		{
			System.out.println(e);
		}
	}

}
