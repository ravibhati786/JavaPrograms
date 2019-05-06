/* 	Write java program to create and run following threads
		a. Display first 10 even numbers.
		b. Display any String for 10 time.
*/

public class Program1 extends Thread {

	public void run()
	{
		for(int i=2;i<=2*10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
		String s = "Ravi ";
		for(int i=0; i<10; i++)
		{
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p = new Program1();
		p.start();
	}

}
