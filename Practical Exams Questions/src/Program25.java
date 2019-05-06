/*	Write a program to accept two strings from user and perform the following operations:
	a. Check if the 1st string begins with the 2nd string
	b. Compare two strings.
	c. Display no of occurrences of 2nd string in 1st string
*/
import java.util.*;
public class Program25 {
	
	public void process(String s1, String s2)
	{
		if(s1.startsWith(s2))
			System.out.println("First string starts with the second string ! True");
		else
			System.out.println("First string starts with the second string ! False");

		if(s1.equals(s2))
			System.out.println("Both strings are equals!");
		else
			System.out.println("Both strings are not equals!");
		
		System.out.println(s1.split(s2,-1).length-1);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program25 p = new Program25();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string =");
		String s1 = in.nextLine();
		System.out.println("Enter the second string =");
		String s2 = in.nextLine();
		p.process(s1,s2);
		
	}

}
