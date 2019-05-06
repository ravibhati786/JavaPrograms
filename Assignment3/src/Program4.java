/*	Define an exception called “No equal Exception” that is thrown when a float value is not equal to 3.14. 
 *  Write a program that uses the above user defined exception.
 */
class NoEqualException extends Exception
{
	NoEqualException(String s)
	{
		super(s);
	}
}
public class Program4 {

	void setData(double v) throws NoEqualException
	{
		if(v != 3.14)
		{
			throw new NoEqualException("Number is Not Equal to 3.14 !");
		}
		else
		{
			System.out.println("The number is correct !");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program4 p = new Program4();
		try{
			p.setData(3.14);
		}
		catch(NoEqualException m)
		{
			System.out.println("Exception occured = "+m);
		}
		
		System.out.println("rest of the code.");
	}

}
