import java.util.Scanner;

/*	Create a class Mobile containing company name, mobile number & cost and write necessary member functions
 *  for the following :- 
 *  	a.	Search the mobile number with given name.
 *  	b.	Search the name with given telephone number.(Use method overloading)
 */
class Mobile{
	String comp_name;
	long mob_number;
	float cost;
	
	Mobile()
	{
		this.comp_name = "";
		this.mob_number = 0;
		this.cost = 0;
	}
	
	Mobile(String c, long mn, float cost)
	{
		this.comp_name = c;
		this.mob_number = mn;
	}
	
	void setData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the company name =");
		comp_name = in.next();
		System.out.println("Enter the mobile number =");
		mob_number = in.nextLong();
		System.out.println("Enter the cost =");
		cost = in.nextFloat();
	}
	
	void display()
	{
		System.out.println(comp_name+" "+mob_number+" "+cost);
	}
	
	static void search(String cname, Mobile mob[])
	{
		
		for(int i=0; i<mob.length; i++)
		{
			if(mob[i].comp_name.equals(cname))
			{
				System.out.println("Mobile numbers with the company "+cname+" =");
				System.out.println(mob[i].mob_number);
			}
			
		}
	}
	
	static void search(long num, Mobile mob[])
	{
		
		
		for(int i=0; i<mob.length; i++)
		{
			if(mob[i].mob_number == num)
			{
				System.out.println("The company name for the Mobile number "+num+" =");
				System.out.println(mob[i].comp_name);
			}
		}
	}
}
public class Program2 {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Mobile []obj = new Mobile[n];
		
		for(int i =0; i<obj.length; i++)
		{
			obj[i] = new Mobile();
			obj[i].setData();
		}
		
		for(int i=0; i<obj.length; i++)
			obj[i].display();
		
		System.out.println("Enter the mobile number to search company = ");
		long i = in.nextLong();
		Mobile.search(i, obj);
		System.out.println("Enter the Company name to search mobile = ");
		String s = in.next();
		Mobile.search(s, obj);
	}
}
