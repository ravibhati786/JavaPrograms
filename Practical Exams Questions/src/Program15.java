/*	Write a java program to display “Hello Java” message n times on the screen.(Use Runnable Interface).
 */
import java.util.*;
		
public class Program15 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please Enter the Number =");
		int n = in.nextInt();
		while(n>0)
		{
			System.out.println("Hello Java");
			n--;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program15 p = new Program15();
		Thread t1 = new Thread(p);
		t1.start();
	}
}
