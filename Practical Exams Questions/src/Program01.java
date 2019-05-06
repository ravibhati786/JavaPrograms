/*	Write a program to read n strings into ArrayList collection. Display the elements of collection
 * 	in reverse order.
 */
import java.util.*;
import java.io.*;
public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of Strings you want to Enter =");
		int n = in.nextInt();
		ArrayList<String> list = new ArrayList<String>(n);
		
		System.out.println("Enter "+n+" elements =");
		for(int i=0; i<=n; i++)
		{
			list.add(in.nextLine());
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println();
		
		ListIterator<String> litr = list.listIterator(list.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}
