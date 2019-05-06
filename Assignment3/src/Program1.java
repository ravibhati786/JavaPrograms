// Accept two numbers a & b from command line argument & print output as a/b and handle all possible system defined exceptions.
import java.util.Scanner;

public class Program1 {

	int a,b,sum;
	
	void setData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number =");
		a = in.nextInt();
		System.out.println("Enter the second number =");
		b = in.nextInt();
	}
	
	void getData()
	{
		try{
			sum = a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Division is = "+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p = new Program1();
		p.setData();
		p.getData();
	}

}
