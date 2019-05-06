// Program to Find Min and Max value from an Array
public class Program1 {

	int arr[] = {13,54,766,75,223};
	int max,min;
	
	Program1()
	{
		min = 0;
		max = 0;
	}
	
	void processdata()
	{
		max = min = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println("Min is ="+min);
		System.out.println("Max is ="+max);
	}
	
	public static void main(String args[])
	{
		Program1 obj = new Program1();
		obj.processdata();		
	}
}
