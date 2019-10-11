import java.util.Scanner;

// Write a program to accept string from the user and print in a pattern.
public class Program2 {

	String s;
	public void getData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String =");
		s = in.nextLine();
	}
	public void processData()
	{
		/*
		for(int i=0; i<(s.length()*2); i++)
		{
			for(int j=0; j<=i; j++)
			{	
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}*/
		for(int i=0; i<s.length(); i++)
			System.out.println(s.substring(0,i));
		for(int i=s.length(); i>=0; i--)
			System.out.println(s.substring(0,i));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 p2 = new Program2();
		p2.getData();
		p2.processData();
		
	}

}
