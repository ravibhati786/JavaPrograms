//Write a program to print name, priority of a thread and change name of current to java thread and display the details of current thread.

public class Program4 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String args[])
	{
		Program4 t = new Program4();
		t.start();
		Program4 t1 = new Program4();
		t1.setName("Java Thread");
		t1.start();
	}
}
