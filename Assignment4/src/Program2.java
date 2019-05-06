/*	Write a program to implement the concept of threading by extending Thread Class and also by implementing interfaces.
 */
class A implements Runnable
{
	public void run()
	{
		System.out.println("thread is running using implementing the Runnable interface!");
	}
}

public class Program2 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running using exteding the Thread class!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 t1 = new Program2();
		t1.start();
		A a = new A();
		Thread t2 = new Thread(a);
		t2.start();
		
	}

}
