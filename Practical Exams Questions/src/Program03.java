/*	Write Java Program to accept a filename and character as command line arguments 
 * 	and replace all occurrences of that character  by ‘*’ .Store the result in “Output.txt”
 */

import java.io.*;

public class Program03 {

	public void process(String f, String c) throws IOException
	{
		FileInputStream fin = new FileInputStream("D:\\java prog\\RaviJavaLabPractice\\Files\\"+f);
		FileOutputStream fout = new FileOutputStream("D:\\java prog\\RaviJavaLabPractice\\Files\\File1Output.txt");
		
		/*String star = "*";
		byte b[] = star.getBytes();
		System.out.println(c);
		int i ;
		while((i=fin.read()) != -1)
		{
			char ch = (char)i;			
			if(Character.toString(ch).equals(c))
				fout.write(b);
			else
				fout.write(i);
		}
		
		System.out.println("Successful");*/
		
		String file = "";
		int i ;
		while((i=fin.read()) != -1)
		{
			file += (char)i;
		}
		
		byte b[] = (file.replaceAll(c, "*")).getBytes();
		fout.write(b);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = args[0];
		String rchar = args[1];
		
		Program03 p = new Program03();
		try {
			p.process(fname, rchar);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
