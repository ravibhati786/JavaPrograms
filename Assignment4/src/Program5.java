//Create an Account class having deposit() & withdraw() methods. Make use of synchronization while withdrawing money in case of joint account.
import java.util.Scanner;
class Account
{
	int acc_num;
	float acc_bal;
	Scanner in = new Scanner(System.in);
	
	void setData()
	{
		
		System.out.print("\nEnter the account number = ");
		acc_num = in.nextInt();
		System.out.println("\nEnter the account balance = ");
		acc_bal = in.nextFloat();
	}
	void deposit()
	{
		System.out.println("\nEnter the amount to deposit =");
		acc_bal = acc_bal + in.nextFloat();
	}
	synchronized void withdraw() 
	{
	
		System.out.print("\nEnter the amount to withdraw = ");
		float w_amt = in.nextFloat();
		
		if(w_amt > acc_bal)
		{
			System.out.print("\nSorry you have less balance in your Account !");
		}
		else
		{
				acc_bal = (acc_bal - w_amt);
				try
				{
					Thread.sleep(4000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}
	}	
		
	void display()
	{
		System.out.print("\n"+acc_num +" " +acc_bal);
	}
}

class MyThread extends Thread
{
	Account a;
	MyThread(Account a)
	{
		this.a = a;
	}
	
	public void run()
	{
	
		a.withdraw();
		a.display();
	}
}

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account();
		a.setData();
		MyThread th1 = new MyThread(a);
		MyThread th2 = new MyThread(a);
		th1.start();
		th2.start();
		
	}

}
