/*	Write a Java program to accept a file name from command prompt. If the file exists, 
	then display number of words and lines in that file using FileReader class.
 */

import java.io.*;

public class Program19 {
	
	public void processData(String fname) throws IOException
	{
		int wcount = 0, lcount = 0;
		FileReader fr = new FileReader("D:\\java prog\\Files\\"+fname);
		FileReader f2 = new FileReader("D:\\java prog\\Files\\"+fname);
		BufferedReader br = new BufferedReader(f2);
		int i ;
		while((i=fr.read()) != -1)
		{
			if((char)i == ' ')
				wcount++;
			
		}
		while(br.readLine() != null)
			lcount++;
		System.out.println("Words ="+wcount+" and Lines ="+lcount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = args[0];
		Program19 p = new Program19();
		try{
			p.processData(fname);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
