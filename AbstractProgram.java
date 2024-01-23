package OOPJLAB;



abstract class Shape
{
	 abstract void  numberOfSides();
	 abstract void SumOfAngles();
}
class Rectangle extends Shape
{
	int side,sum;
	Rectangle(int side4)
	{
		side=side4;
		
	}
	void numberOfSides()
	{
		System.out.println("I am Rectangle,I have "+side+" sides");
	}
	void SumOfAngles()
	{
		sum=(side-2)*180;
		System.out.println("Sum of the Angles of Rectangle="+sum);
	}
}

class Triangle extends Shape
{
	int side,sum;
	Triangle(int side4)
	{
		side=side4;
		
	}
	void numberOfSides()
	{
		System.out.println("I am Triangle,I have "+side+" sides.");
	}
	void SumOfAngles()
	{
		sum=(side-2)*180;
		System.out.println("Sum of Angles of Triangle="+sum);
	}

}

class Hexagon extends Shape
{
	int side,sum;
	Hexagon(int side4)
	{
		side=side4;
	}
	void numberOfSides()
	{
		System.out.println("I am Hexagon,I have "+side+" sides.");
	}
	void SumOfAngles()
	{
		sum=(side-2)*180;
		System.out.println("Sum of the Angles of Hexagon="+sum);
	}

}


public class AbstractProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(4);
		Triangle t=new Triangle(3);
		Hexagon h=new Hexagon(6);
		r.numberOfSides();
		r.SumOfAngles();

		t.numberOfSides();
		t.SumOfAngles();
		
		h.numberOfSides();
		h.SumOfAngles();
	}

}
