/* Create an abstract class Shape with methods calc_area and calc_volume. Derive three classes Sphere(radius),
 * Cone(radius, height) and Cylinder(radius, height), Box(length, breadth, height) from it. Calculate area
 * and volume of all. (Use Method Overriding). * 
 */
abstract class Shape1
{
	//void calc_Area();
	//void calc_Volume();
	abstract void calc_Area(); 	
	abstract void calc_Volume();
}

class Box extends Shape1
{
	float length, breadth, height;
	Box(float l, float b, float h)
	{
		this.length = l;
		this.breadth = b;
		this.height = h;
	}
	@Override
	void calc_Area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Box =");
		System.out.println((2*(height+breadth))+(2*(height+length))+(2*(breadth+length)));
		
	}
	@Override
	void calc_Volume() {
		// TODO Auto-generated method stub
		System.out.println("Volume of Box =");
		System.out.println(height*breadth*length);
	}
	
}
class Cylinder extends Shape1
{
	double radius, height;
	Cylinder(double r, double h)
	{
		this.radius =r;
		this.height = h;
	}
	@Override
	void calc_Area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Cylinder =");
		System.out.println(2*22/7*radius*radius+2*22/7*radius*height);
	}
	@Override
	void calc_Volume() {
		// TODO Auto-generated method stub
		System.out.println("Volume of Cylinder =");
		System.out.println(22/7*radius*height);
	}
}
class Cone extends Shape1
{
	double radius, height;
	Cone(double r, double h)
	{
		this.radius = r;
		this.height = h;
	}
	@Override
	void calc_Area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Cone =");
		System.out.println(22/7*radius*radius + 22/7*radius*height);
	}

	@Override
	void calc_Volume() {
		// TODO Auto-generated method stub
		System.out.println("Volume of Cone =");
		System.out.println(22/7*radius*radius*(height/3));
	}
	
}
class Sphere extends Shape1
{
	double radius;
	
	Sphere(double r)
	{
		this.radius = r;
	}
	
	@Override
	void calc_Area() {
		// TODO Auto-generated method stub
		System.out.println("Area of Sphere =");
		System.out.println(4*22/7*radius*radius);
	}

	@Override
	void calc_Volume() {
		// TODO Auto-generated method stub
		System.out.println("Volume of Sphere =");
		System.out.println(4/3*22/7*radius*radius*radius);
	}
	
}

public class Program4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(5, 3, 7);
		b1.calc_Area();
		b1.calc_Volume();
		Cylinder c1 = new Cylinder(5,10);
		c1.calc_Area();
		c1.calc_Volume();
		Cone c2 = new Cone(8,15);
		c2.calc_Area();
		c2.calc_Volume();
		Sphere s1 = new Sphere(5);
		s1.calc_Area();
		s1.calc_Volume();
	}

}
