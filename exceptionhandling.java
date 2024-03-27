package ExamPractice;

import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
	while(true) {
		System.out.println("Select the option:\n1:Arithmeticexception\n2:Arrayindexoutofboundsexception\n3:Exit\nEnter the option: ");
		Scanner sc=new Scanner(System.in);
		choice =sc.nextInt();
		switch(choice)
		{
		case 1:
			try
			{
				int num1,num2,result;
				System.out.print("Enter the 1st num: ");
				num1=sc.nextInt();
				System.out.print("Enter the 2nd num: ");
				num2=sc.nextInt();
				result=num1/num2;
				System.out.println("Result= "+result);
				System.out.println("No exception occured!!!");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			try
			{
				int n;
				System.out.println("Enter the limit: ");
				n=sc.nextInt();
				int[] array=new int[n];
				System.out.println("Enter the array elements: ");
				for(int i=0;i<n;i++)
				{
					array[i]=sc.nextInt();
				}
				System.out.println("limit: "+n);
				System.out.println("Array elements are: ");
				for(int i=0;i<n;i++)
				{
					System.out.println(array[i]+"  ");
				}
				System.out.print("enter the index :");
				int pos=sc.nextInt();
				System.out.println("element in "+pos+" is "+array[pos-1]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("exception: "+e.getMessage());
			}
			break;
		case 3: System.exit(0);
			break;
		default: System.out.println("invalid output!!");
		break;
		}
	}
	}

}
