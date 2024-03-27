package ExamPractice;

import java.util.*;

public class Exception {

	public static void main(String[] args) 
	{
		System.out.println("Enter the exception");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			try
			{
				System.out.println("Enter the 1st number");
				int num1=sc.nextInt();
				System.out.println("Enter the 2nd number");
				int num2=sc.nextInt();
				float result=num1/num2;
				System.out.println("result= "+result);
			}
			catch(ArithmeticException e)
			{
				System.out.println("ArithmeticException:"+e.getMessage());
			}
			finally
			{
				System.out.println("End of Catch block");
			}
			break;
		case 2:System.exit(0);
				break;
		default:break;
		}
	}

}
