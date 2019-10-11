import java.util.Scanner;

// Accept any 9 number from 1 to 10 and find missing number
public class Program3 {
	
	int arr[];
	int sum;
	void getData()
	{
		arr = new int[9];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your 9 numbers");
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		System.out.println("Missing number is ="+(55-sum));
	
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program3 p = new Program3();
		p.getData();
	}

}
