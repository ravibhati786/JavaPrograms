/*
 * Write a program to show how file class is used to display information about a directory and all the files included in current directory.
 */
import java.io.*;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\java prog\\Files\\");
		System.out.println(file.list());
		String []files = file.list();
		for(String names : files)
			System.out.println(names);

	}

}
