/*	Write a Java program to accept email address of a user and throw a user defined exception 
 	InvalidEmailException if it starts with digit or does not contain @ symbol.
 */
class InvalidEmailException extends Exception
{
	public InvalidEmailException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}
public class Program21 {

	public void check(String s) throws InvalidEmailException
	{
		if((!s.contains("@")) || (Character.isDigit(s.charAt(0))))
		{
			throw new InvalidEmailException("Email is not Valid!");
		}
		else
		{
			System.out.println("Email is valid!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program21 p = new Program21();
		try
		{
			p.check("ravi@gmail");
		}
		catch(InvalidEmailException e)
		{
			System.out.println(e);;
		}
	}

}
