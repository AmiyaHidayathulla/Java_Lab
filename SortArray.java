package ExamPractice;

import java.util.*;
//import java.util.Arrays;
public class SortArray {

	public static void main(String[] args) {
		
		System.out.print("Enter the size of the array: ");
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int[] array=new int[limit];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<limit;i++)
		{
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		System.out.println("Sorted array is:");
		for(int i=0;i<limit;i++)
		{
			System.out.print(array[i]+"  ");
		}
		System.out.println("biggest no is "+array[limit-1]+"\n smallest no is "+array[0]);
	}

}
