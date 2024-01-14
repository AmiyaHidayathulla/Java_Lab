package PracticeQuestions;


import java.util.Scanner;
class Triangle {
int side1,side2,side3;
int perimeter()
{
return((side1+side2+side3));
}
double area()
{
double s=(double)(perimeter())/2;
return(Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
}

}

public class AreaAndPerimeter {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Triangle t=new Triangle();
System.out.println("Enter the sides of the triangle");
t.side1=s.nextInt();
t.side2=s.nextInt();
t.side3=s.nextInt();
System.out.println("Perimeter is "+t.perimeter());
System.out.println(("Area is "+t.area()));
s.close();
}
}
