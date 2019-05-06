/*	Create an interface “CreditCardInterface” with methods : viewCreditAmount(), useCard(), payCredit() and increaseLimit(). 
   	Create a class SilverCardCustomer (name, cardnumber (16 digits), creditAmount – initialized to 0, creditLimit - set to 50,000 )
	which implements the above interface. Inherit class GoldCardCustomer from SilverCardCustomer having the same methods 
	but creditLimit of 1,00,000. Create an object of each class and perform operations. 
	Display appropriate messages for success or	failure of transactions. (Use method overriding)
		i. useCard() method increases the creditAmount by a specific amount upto creditLimit
		ii. payCredit() reduces the creditAmount by a specific amount.
		iii. increaseLimit() increases the creditLimit for GoldCardCustomers (only 3 times, not more than 5000Rs. each time)
*/
import java.util.Scanner;
interface CreditCardInterface
{
	void viewCreditAmount();
	void useCard();
	void payCredit();
	void increaseLimit();
}
class GoldCardCustomer implements CreditCardInterface
{
	String name;
	long card_number;
	float credit_Amount;
	float credit_Limit;
	Scanner in = new Scanner(System.in);
	
	GoldCardCustomer()
	{
		name = "";
		card_number = 0;
		credit_Amount = 0;
		credit_Limit = 100000;
	}
	
	GoldCardCustomer(String n, long num)
	{
		name = n;
		card_number = num;
	}
		
	@Override
	public void viewCreditAmount() {
		// TODO Auto-generated method stub
		System.out.println("Your Credit Amount is = "+credit_Amount);
	}

	@Override
	public void useCard() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to credit = ");
		int i = in.nextInt();
		if(credit_Amount + i > credit_Limit)
			System.out.println("Sorry! Your limit is sufficient for this amount.");
		else
			credit_Amount = credit_Amount + i;
	}

	@Override
	public void payCredit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to deposit =");
		int i = in.nextInt();
		credit_Amount = credit_Amount - i;
	}

	@Override
	public void increaseLimit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the new limit =");
		int i = in.nextInt();
		credit_Limit = i;
	}
	
	void display()
	{
		System.out.println(name+" "+card_number+" "+credit_Amount+" "+credit_Limit);
	}
	
	
}

class SilverCardCustomer implements CreditCardInterface
{
	String name;
	Long card_number;
	float credit_Amount;
	float credit_Limit;
	Scanner in = new Scanner(System.in);
	SilverCardCustomer()
	{
		name = "";
		card_number = (long) 0;
		credit_Amount = 0;
		credit_Limit = 50000;
	}
	
	SilverCardCustomer(String n, Long num)
	{
		name = n;
		card_number = num;
	}
	
	@Override
	public void viewCreditAmount() {
		// TODO Auto-generated method stub
		System.out.println("Your Credit Amount is = "+credit_Amount);
	}

	@Override
	public void useCard() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to credit = ");
		int i = in.nextInt();
		if(credit_Amount + i > credit_Limit)
			System.out.println("Sorry! Your limit is sufficient for this amount.");
		else
			credit_Amount = credit_Amount + i;
	}

	@Override
	public void payCredit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to deposit =");
		int i = in.nextInt();
		credit_Amount = credit_Amount - i;
	}

	@Override
	public void increaseLimit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the new limit =");
		int i = in.nextInt();
		credit_Limit = i;
	}
	
	void display()
	{
		System.out.println(name+" "+card_number+" "+credit_Amount+" "+credit_Limit);
	}
	
}

public class Program9 {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the card number for gold =");
		long crdno=in.nextLong();//(long)2018201720152014;
		GoldCardCustomer gd = new GoldCardCustomer("Ravi",crdno);
		gd.display();
		gd.useCard();
		gd.viewCreditAmount();
		gd.payCredit();
		gd.viewCreditAmount();
		gd.increaseLimit();
		gd.display();
		System.out.println("Enter the card number for silver =");
		crdno = in.nextLong();
		SilverCardCustomer sd = new SilverCardCustomer("Kanchan",crdno);
		sd.display();
		sd.useCard();
		sd.viewCreditAmount();
		sd.payCredit();
		sd.viewCreditAmount();
		sd.increaseLimit();
		sd.increaseLimit();
	}
}
