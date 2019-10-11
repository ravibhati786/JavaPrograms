import java.util.*;
public class Program1 {

	int arr[];
	ArrayList<Integer> brrr;
	int min,max,n;
	public void Program1()
	{
		min= 0;
		max = 0;
	}
	public void getData()
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements of array =");
		n = in.nextInt();
		arr = new int[n];
		
		System.out.println("Enter "+n+" elements of the array=");
		for(int i=0; i<n; i++)
		{	
			arr[i] = in.nextInt();
			if(arr[i]>max)
				max = arr[i];
		}
		min = arr[0];
		for(int i=0; i<n; i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
	}
	
	public void processData()
	{
		brrr = new ArrayList<Integer>();
		int j = min;
		int l =0;
		while(j<max)
		{	
			boolean flag = true;
			j++;
			for(int k=0; k<n; k++)
			{
				if(arr[k] == j)
				{
					flag =false;
					break;
				}
			}
			if(flag)
			{
				brrr.add(j);
				//brr[l] = j;
				l++;
			}
		}
	}
	public void display()
	{
		System.out.println("Enter Enter Array was =");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println();
		System.out.println("Created Array is ="+brrr);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program1 p = new Program1();
		p.getData();
		p.processData();
		p.display();
	}

}
