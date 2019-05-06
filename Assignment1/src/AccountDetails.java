import java.util.Scanner;

class Account {
	int accountNo, balance;
	String accountType, custName;
	
	Account()
	{
		this.accountNo = 0;
		this.custName = "";
		this.accountType = "";
		this.balance = 0;
	}
	void acceptData()
	{
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the Account Number =");
		this.accountNo = in.nextInt();
		System.out.println("Enter the Customer Name =");
		this.custName = in.next();
		System.out.println("Enter the Account Type =");
		this.accountType = in.next();
		System.out.println("Enter the Account Balance =");
		this.balance = in.nextInt();		
	}
	void deposit(int b)
	{
		this.balance += b; 
	}
	void withdraw(int w)
	{
		if(this.balance == 0)
		{
			System.out.println("Sorry! Your Balance is 0 !");
		}
		else
		{
			if(this.balance < w)
				System.out.println("Sorry! Your balance is less than withdrawl amount!");
			else
				this.balance -= w;
		}
		
	}
	void showBalance()
	{
		System.out.println("AccountNo\tName\tType\tBalance");
		System.out.println(accountNo+"\t"+custName+"\t"+accountType+"\t"+balance);
	}
}
public class AccountDetails {
	public static void main(String args[])
	{
		Account ob = new Account();
		ob.acceptData();
		ob.showBalance();
		ob.deposit(15000);
		ob.showBalance();
		ob.withdraw(10000);
		ob.showBalance();
	}
}
