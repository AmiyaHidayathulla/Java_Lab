package ExamPractice;

import java.util.*;

public class ArrayTest {

	public static void main(String[] args) 
	{
		int limit;
		System.out.println("enter the limit of the array");
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		int[]array=new int[limit];
		System.out.println("Enter the array elements");
		for(int i=0;i<limit;i++)
		{
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.print("the sorted array is:");
		for(int i=0;i<limit;i++)
		{
			System.out.print(array[i]+"\t");
		}
		System.out.println("the second largest element= "+array[limit-2]);
		System.out.println("the second smallest element= "+array[1]);
		sc.close();
	}

}
