package SY;

import java.util.Scanner;

public class SYMarks {
	float computerTotal, mathsTotal, electronicTotal;
	
	public SYMarks()
	{
		computerTotal = 0;
		mathsTotal = 0;
		electronicTotal = 0;
	}
	
	public void setMarks()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Computer marks =");
		computerTotal = in.nextFloat();
		System.out.println("Enter the Maths marks =");
		mathsTotal = in.nextFloat();
		System.out.println("Enter the Electronic marks =");
		electronicTotal = in.nextFloat();
	}
	
	public void getMarks()
	{
		System.out.print(computerTotal +" "+mathsTotal+" "+electronicTotal);
	}
	
	public float getTotal()
	{
		return computerTotal + mathsTotal + electronicTotal;
	}
	
}
