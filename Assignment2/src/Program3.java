/* Write a program to design a Shape as an interface with drawShape() and then design class for Rectangle,
 * Triangle and Hexagon which implements the interface and override method drawShape(); * 
 */
interface Shape
{
	void drawShape();
}

class Rectangle implements Shape
{
	double width,height;
	
	Rectangle(double w, double h)
	{
		this.width = w;
		this.height = h;
	}
	
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Rectangle");
		System.out.println("Area is = "+this.width*this.height);
	}
}

class Triangle implements Shape
{
	double base,height;
	
	Triangle(double b, double h)
	{
		this.base = b;
		this.height = h;
	}
	
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Triangle");
		System.out.println("Area is ="+((base*height)/2));
	}
}

class Hexagon implements Shape
{

	
	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Hexagon");
	}
	
}

public class Program3 {
	public static void main(String args[])
	{
		Triangle t1 = new Triangle(4,20);
		t1.drawShape();
		Rectangle r1 = new Rectangle(21,10);
		r1.drawShape();
		Hexagon h1 = new Hexagon();
		h1.drawShape();
	}
}
