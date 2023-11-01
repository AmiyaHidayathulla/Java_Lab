package OOPJLAB;
import java.util.*;
class Employee {
	String name=new String();
	int age;
	String address=new String();
	double salary;
	Long phoneno;
	Employee(String name1,int age1,long phoneno1,String address1,float salary1)
	{
		name=name1;
		age=age1;
		phoneno=phoneno1;
		address=address1;
		salary=salary1;
	}
	void printsalary()
	{
		System.out.println("Salary:"+salary);
	}
	void display()
	{
		System.out.println("Name:"+name+"\nAge:"+age+"\nAddress:"+address+"\nSalary:"+salary+"\nPhone no:"+phoneno);
	}
}
class Officer extends Employee
{
	String specialisation=new String();
	Officer(String name1,int age1,long phoneno1,String address1,float salary1,String specialisation1)
	{
		super(name1,age1,phoneno1,address1,salary1);
		specialisation=specialisation1;
	}
	void print_specialisation()
	{
		System.out.println("specialisation="+specialisation);
	}
}
class Manager extends Employee
{
	String Department=new String();
	Manager(String name1,int age1,long phoneno1,String address1,float salary1, String Department1)
	{
		super(name1,age1,phoneno1,address1,salary1);
		Department=Department1;
	}
	void print_department()
	{
		System.out.println("Department="+Department);
	}

}

public class EmployeeDetails
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age;
		String name=new String();
		float salary;
		long phoneno;
		String address=new String();
		String specialisation=new String();
		String department=new String();
		System.out.println("ENTER THE DETAILS OF THE OFFICER:\nEnter the Name:");
		name=sc.nextLine();
		System.out.println("Enter Age:");
		age=sc.nextInt();
		System.out.println("Enter Phone Number:");
		phoneno=sc.nextLong();
		System.out.println("Enter the Address:");
		address=sc.next();
		System.out.println("Enter Salary:");
		salary=sc.nextFloat();
		System.out.println("Enter the Specialisation:");
		specialisation=sc.next();
		
		Officer o=new Officer(name,age,phoneno,address,salary,specialisation);
		
		System.out.println("ENTER THE DETAILS OF THE MANAGER:\nEnter the Name:");
		name=sc.next();
		System.out.println("Enter Age:");
		age=sc.nextInt();
		System.out.println("Enter Phone Number:");
		phoneno=sc.nextLong();
		System.out.println("Enter the Address:");
		address=sc.next();
		System.out.println("Enter Salary:");
		salary=sc.nextFloat();
		System.out.println("Enter the Department:");
		department=sc.next();

		Manager m=new Manager(name,age,phoneno,address,salary,department);
		
		
		System.out.println("OFFICER DETAILS\n");
		o.display();
		o.print_specialisation();
		System.out.println("\nMANAGER DETAILS\n");
		m.display();
		m.print_department();
		sc.close();
		
	}
}


