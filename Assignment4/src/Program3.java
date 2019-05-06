// Write a program to set the priority of two above threads and check which thread executes first.

public class Program3 extends Thread 
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String args[])
	{
		Program3 t1 = new Program3();
		Program3 t2 = new Program3();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
	}
}
