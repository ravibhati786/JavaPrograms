package TY;

import java.util.Scanner;

public class TYMarks {
	float theory, practicals;
	
	public TYMarks()
	{
		theory = 0;
		practicals = 0;
	}                                                                                                                                                                                                                      
	
	public void setMarks()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the theory marks =");
		theory = in.nextFloat();
		System.out.println("Enter the practical marks =");
		practicals = in.nextFloat();
	}
	
	public void getMarks()
	{
		System.out.println(theory+" "+practicals);
	}
	
	public float getTotal()
	{
		return theory + practicals;
	}
	
}
