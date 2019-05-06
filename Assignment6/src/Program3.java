/*
 * Write a program to check whether the file is readable, Writable or hidden.
 */
import java.io.*;
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\java prog\\Files\\ravi.dat");
		System.out.println("File Can be Read : "+file.canRead()+", File can be write : "+file.canWrite()+", File is hidden: "+file.isHidden());
	}

}
