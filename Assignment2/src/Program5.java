/*	Write a Java program to create a super class Vehicle having members Company and
	price. Derive 2 different classes LightMotorVehicle (members – mileage) and
	HeavyMotorVehicle (members – capacity-in-tons). Accept the information for n vehicles
	and display the information in appropriate form. While taking data, ask the user about the
	type of vehicle first.
*/

import java.util.Scanner;

class Vehicle
{
	String company;
	float price;
	Scanner in;
	
	Vehicle()
	{
		in = new Scanner(System.in);
	}
	
	void setData()
	{
		System.out.println("Enter the company = ");
		this.company = in.next();
		System.out.println("Enter the price = ");
		this.price = in.nextFloat();
	}
	
	void getData()
	{
		System.out.print("\n"+company+" "+price);
	}
	
}
class LightMotorVehicle extends Vehicle
{
	float mileage;
	
	void setData()
	{
		super.setData();
		System.out.println("Enter the mileage = ");
		this.mileage = in.nextFloat();
	}
	
	void getData()
	{
		super.getData();
		System.out.print(" "+"Mileage ="+ mileage);
	}
}
class HeavyMotorVehicle extends Vehicle
{
	float capacity_in_tons;
	
	void setData()
	{
		super.setData();
		System.out.println("Enter the Capacity = ");
		this.capacity_in_tons = in.nextFloat();
	}
	
	void getData()
	{
		super.getData();
		System.out.print(" "+"Capcity= "+ capacity_in_tons);
	}
}
public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of vehicle =");
		int n = in.nextInt();
		Vehicle []v = new Vehicle[n];
		int vType;
		
		for(int i =0; i<v.length; i++)
		{
			System.out.println("Press 1 for Light Motor Vehicle.");
			System.out.println("Press 2 for Heavy Motor Vehicle.");
			vType = in.nextInt();
			
			if(vType == 1)
			{
				v[i] = new LightMotorVehicle();
				v[i].setData();
			}
			else if(vType == 2)
			{
				v[i] = new HeavyMotorVehicle();
				v[i].setData();
			}
			else
			{
				System.out.println("Wrong Input."); 
				break;
			}
		}
		
		for(int i=0; i<v.length; i++)
			v[i].getData();
	}

}
