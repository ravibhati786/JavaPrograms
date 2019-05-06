//	Accept n strings from the user and write only those strings to the file which contains ‘and ’ as substring

import java.util.*;
import java.io.*;
public class Program11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		FileWriter fout = new FileWriter("D:\\java prog\\Files\\Output1.txt");
		System.out.println("Enter the number of Strings you want to Enter = ");
		int n = in.nextInt();
		String s = "";
		System.out.println("Enter the line = ");
		for(int i=0; i<n; i++)
		{
			s = in.nextLine();
			if(s.contains("and"))
			{
				fout.write(s);
			}
		}
		fout.close();
		System.out.println("Successful");
	}

}
