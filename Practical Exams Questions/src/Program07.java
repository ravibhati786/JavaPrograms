/*Write a java program using multithreading to execute the threads sequentially.(Use Synchronized Method)
*/
class Table
{
	synchronized public void print(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Thread1 extends Thread
{
	Table t;
	Thread1(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.print(5);
	}
}
class Thread2 extends Thread
{
	Table t;
	Thread2(Table t)
	{
		this.t = t;
	}
	public void run()
	{
		t.print(100);
	}
}
public class Program07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table tb = new Table();
		Thread1 t1 = new Thread1(tb);
		Thread2 t2 = new Thread2(tb);
		t1.start();
		t2.start();
		
	}

}
