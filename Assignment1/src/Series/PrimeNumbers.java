package Series;

public class PrimeNumbers {

	int p;
	
	public PrimeNumbers(int p)
	{
		this.p = p;
	}
	
	public void isPrime()
	{
		int flag =0;
		for(int i=2; i<p; i++)
		{
			if(p%2 == 0)
				flag = 1;
		}
		if(flag == 0)
			System.out.println(p+" is a Prime Number");
		else
			System.out.println(p+" is not Prime Number");
	}
	public void primeUpto()
	{
		System.out.println("Prime Numbers are =");
		for(int i=2; i<=p; i++)
		{
			int flag =0, j=2;
			while(j<i)
			{
				if(i%j == 0)
					flag = 1;
				j++;
			}
			if (flag==0)
				System.out.print(i+" ");
		}
	}
	
	
}
