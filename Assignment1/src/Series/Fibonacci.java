package Series;
public class Fibonacci {
	int n;
	
	/*public Fibonacci()
	{
		n = 0;
	}*/
	public Fibonacci(int n)
	{
		this.n = n;
	}
	public void displaySeries()
	{	
		System.out.println("Fibonacci Series is =");
		int a=0,b=1,sum =0;
		for(int i=0; i<n; i++)
		{
			sum = a+b;
			a = b;
			b = sum;
			System.out.print(sum+" ");
		}
	}
	
}
