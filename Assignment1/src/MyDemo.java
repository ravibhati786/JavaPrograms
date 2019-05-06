
public class MyDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 50;
		int var2 = 100;
		System.out.println("Hello World!");
		
		if(var1 > var2)
			System.out.println("Greater number is = "+var1);
		else
			System.out.println("Greater number is= " +var2);
		
		
		for(int i = 0; i<5; i++)
		{
			for(int j=0; j<=i; j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		//System.out.println("Hello World!");
		
		for(int i = 1; i<=5; i++)
		{
			for(int j=1; j<=i; j++){
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		
		for(int i = 1; i<=5; i++)
		{
			for(int j=1; j<=5-i; j++)
				System.out.print(" ");
			for(int k=0; k<i*2-1; k++)
				System.out.print("*");
			System.out.println();
			
		}
		
		/*int rows =5;
		
		for(int i =1; i<=rows; ++i)
		{
			for(int space = 1; space <= rows -i; ++space)
				System.out.print(" ");
			for(int k=0; k<2*i-1; k++)
				System.out.print("*");
			System.out.println();
		}*/
		int k;
		for(int i = 1; i<=5; i++)
		{	
			for(int j=1; j<=5-i; j++)
				System.out.print(" ");
			for(k=i; k<=i*2-1; k++)
				System.out.print(k);
			for(int l=k-2; l>=i; l--)
				System.out.print(l); 
			System.out.println();
			
		}
		
	}

}
