class Computer
{
	int modelno;
	String company, processor;
	
	Computer(int m, String c, String p)
	{
		modelno = m;
		company = c;
		processor = p;
	}
	public void Display()
	{
		System.out.println(modelno+" "+company+" "+processor);
	}
	
}

class Laptop
{
	int modelno;
	String company, Type;
	
	Laptop(int m, String c, String t)
	{
		modelno = m;
		company = c;
		Type = t;
	}
	
	public void Display()
	{
		System.out.println(modelno+" "+company+" "+Type);
	}
}
public class CompLap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
