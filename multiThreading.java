package OOPJLAB;
import java.util.Random;
import java.util.Scanner;
class Test extends Thread
{	
	int num;
	public void run()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the limit of the number:");
		int limit=sc.nextInt();
		for(int i=0;i<limit;i++)
		{
		double rand = Math.random()*100;
		int num= (int)rand;
		 
		 System.out.println("The randomly selected Number is "+num);
		if(num%2==0)
		{
			Thread1 t1=new Thread1(num);
			t1.start();
		}
		else
		{
			Thread2 t2=new Thread2(num);
			t2.start();
		}
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
		sc.close();
		
	}
}
class Thread1 extends Thread
{
	int num;
	Thread1(int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("Square of a number "+num+" = "+(num*num));
	}
}
class Thread2 extends Thread
{	int num;
	Thread2(int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("Cube of a number "+num+" = "+(num*num*num));
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		Test t= new Test();
		t.start();
}
}
