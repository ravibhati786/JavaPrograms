/*	Write a java program which will display name and priority of current thread.
	Change name of Thread to MyThread and set the priority to 2 and display it on screen.
 */

public class Program09 extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Program09 t1 = new Program09();
		Program09 t2 = new Program09();
		
		t1.start();
		t2.start();
		t1.join();
		t1.setPriority(2);
		t1.setName("MyThread");
		
		System.out.println(t1.getName() +" "+ t1.getPriority());
	}

}
