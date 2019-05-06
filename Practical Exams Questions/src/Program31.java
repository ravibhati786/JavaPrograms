/*	Write a multithreading program in java to display all the vowels from a given String.
 */

public class Program31 extends Thread{
	String s;
	Program31(String s)
	{
		this.s = s;
	}
	public void run()
	{
		System.out.println("Vowels are :- ");
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				System.out.println(" "+ch);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program31 p = new Program31("HelloThis is ravi ");
		p.start();
	}

}
