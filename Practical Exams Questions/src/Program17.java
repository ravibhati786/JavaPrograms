/*
Write a java program which display the contents of file in reverse order
 */
import java.io.*;
public class Program17 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Character Wise
		FileInputStream fin = new FileInputStream("D:\\java prog\\Files\\Output1.txt");
		int n ;
		StringBuffer s = new StringBuffer(" ");
		while((n=fin.read()) != -1)
		{
			s.append((char)n);
		}
		System.out.println(s.reverse());
		fin.close();
		//Word Wise
		/*
		FileInputStream fin1 = new FileInputStream("D:\\java prog\\Files\\Output1.txt");
		DataInputStream d = new DataInputStream(fin1);
		BufferedReader in = new BufferedReader(new InputStreamReader(d));
		StringBuffer s1 = new StringBuffer(" ");
		String sv = " ";
		while((s1.in.readLine()) != null)
		{
			
			System.out.println(sv);
		}
		System.out.println(s1.reverse());
		*/
	}

}
