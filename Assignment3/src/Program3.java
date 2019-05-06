/*	Write a program to demonstrate use of user-defined exception, the CheckingAccount class contains a withdraw() method 
 	that throws an InsufficientFundsException.
*/
import java.util.Scanner;
class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String s)
	{
		super(s);
	}
}
class CheckingAccount
{
	int balance;
	
	CheckingAccount()
	{
		balance = 5000;
	}
	void withdraw() throws InsufficientFundsException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the amount = ");
		int amt = in.nextInt();
		if(amt > balance)
		{
			throw new InsufficientFundsException("Insfficient Funds Exception !");
		}
		else
		{
			balance -= amt;
		}
	}
	void showBalance()
	{
		System.out.println("Balance is ="+balance);
	}
}
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ca = new CheckingAccount();
		try{
			ca.withdraw();	
		}
		catch(Exception m){
			System.out.println("Exception occured = "+m);
		}
		
		ca.showBalance();
	}

}
