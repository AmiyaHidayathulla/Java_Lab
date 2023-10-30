package OOPJLAB;
import java.util.*;
class Employee1
{
	double salary,da,hra,grossSalary;
	void display()
	{
		System.out.println(".....EMPLOYEE.....");
	}
		void calcSalary()
	{
		grossSalary=salary+(salary*da)/100+(salary*hra)/100;
		System.out.println("Gross Salary of Employee="+grossSalary);
	}
}
class Engineer extends Employee1
{
	
	void display()
	{
		super.display();
		super.calcSalary();
		System.out.println(".....Engineer.....");
	}
	
	void calcSalary()
	{
		
		System.out.println("Gross Salary of Engineer="+2*grossSalary);
	
	}
}
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Engineer obj=new Engineer();
		System.out.println("Enter the basic Salary of the Employee");
		obj.salary=sc.nextInt();
		System.out.println("Enter the DA% of the Employee");
		obj.da=sc.nextInt();
		System.out.println("Enter the HRA% of the Employee");
		obj.hra=sc.nextInt();
		
		obj.display();
		obj.calcSalary();
		sc.close();
		
	}

}
