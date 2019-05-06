import java.util.Scanner;


public class Lab3 {
	
	
	void prime(int n)
	{
		int flag = 0;
		for(int i = 2; i<n; i++)
		{
			if(n/i == 0)
			{
				flag = 1;
			}
		}
		if(flag == 0)
			System.out.println("The number "+n+" is a prime number!");
		else
			System.out.println("The number "+n+" is not a prime number!");
	}
	
	void range(int r1, int r2)
	{
		int sum, i;
		for(int n=r1; n<=r2; n++)
		{
			i = 1;
			sum = 0;
			while(i<n)
			{
				if(n%i==0)
				{
					sum = sum + i;
				}
				i++;
			}
			if(sum == n)
				System.out.println(n);
		}
	}
	
	void multiplyMatrices()
	{
		Scanner in=new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		int[][] brr = new int[3][3];
		int[][] crr = new int[3][3];
		
		System.out.println("Enter the elements of your first Matrix");
		int i,j,k;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				arr[i][j] =in.nextInt();
			}
		}
		
		System.out.println("Your Matrix is = \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("Enter the elements of your Second Matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				brr[i][j] =in.nextInt();
			}
		}
		
		System.out.println("Your Matrix is = \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(brr[i][j]+"\t");
			}
			System.out.println();
		}
		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				int sum =0;
				for(k=0;k<3;k++)
				{
					sum += arr[i][k] * brr[k][j];
				}
				crr[i][j] = sum;
			}
		
		}
		
		
		System.out.println("After Multiplication Your Matrix is = \n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(crr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	void fabonacci()
	{
		System.out.println("Enter any Number =");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a=1,b=0,c=0;
		while(c<n)
		{
			c = a+b;
			a = b;
			b = c;
			System.out.print(c+",");
		}
		
	}
	
	void pattern()
	{
		int rows = 6;
		for(int i=0; i<rows; i++)
		{
			for(int j=i; j<rows; j++)
				System.out.print("$");
			for(int k=0; k<i*2-1; k++)
				System.out.print(" ");
			for(int l=i; l<rows; l++)
				System.out.print("$");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3 ob = new Lab3();
		
		int n1,n2;
		/*n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		System.out.println(n1 + "  " +n2);
		ob.range(1,100);
		
		ob.prime(57);
		ob.fabonacci();
		ob.multiplyMatrices();
		*/
		
		ob.pattern();
	}

}
