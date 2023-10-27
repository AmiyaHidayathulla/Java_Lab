package OOPJLAB;
import java.util.*;
class MethodOverLoading 
{
	void calculatearea(float radius)
	  {
		   double result;
		   result=3.14*radius*radius;
		   System.out.println("Area of a circle with radius "+radius+" is "+result);
	  }
	  void calculatearea(int width,int length)
	  {
		  double result;
		
		   result=width*length;
		   System.out.println("Area of a rectangle with width "+width+" and length "+length+" is "+result);
	  }
	  void calculatearea(int height,int sidea,int sideb)
	  {
		  double result;
		   result=(0.5*height)*(sidea+sideb);
		   System.out.println("Area of a trapezium with height "+height+" is "+result);
	  }
	  void calculatearea(float breadth,float height)
	  {
		  double result;
		   result=0.5*breadth*height;
		   System.out.println("Area of a triangle with height "+height+" and breadth "+breadth+ "is "+result);
	  }
	  
}
public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading obj=new MethodOverLoading();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the base and height of the triangle");
		 float b=sc.nextFloat();
		 float h=sc.nextFloat();
		 
		System.out.println("\nenter the radius of the circle");
		 float r=sc.nextFloat();
		
		System.out.println("\nenter the length and breadth of the rectangle");
		 int l=sc.nextInt();
		 int w=sc.nextInt();
		 
		System.out.println("\nenter the height and parallel sides of a trapezium");
		 int x=sc.nextInt();
		 int y=sc.nextInt();
		 int z=sc.nextInt();
		 
		 obj.calculatearea(b,h);
		 obj.calculatearea(r);
		 obj.calculatearea(x,y,z);
		 obj.calculatearea(l,w);
		 sc.close();
	}
	}
