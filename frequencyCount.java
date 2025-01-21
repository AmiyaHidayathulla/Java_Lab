package ExamPractice;

import java.util.*;

public class FrequencyCount {

	public static void main(String[] args) {
		int count = 0,flag=0;
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=str.toLowerCase();
		char[]c=str2.toCharArray();
		System.out.println("Enter the alphabet: ");
		char al=sc.next().charAt(0);
		for(char ch:c)
		{
			if(ch==al)
			{
				count=count+1;
				flag=flag+1;
				
			}
		}
		if(flag!=0)
		{
			System.out.println("The occurance of "+al+" is "+count+" times");
		}
		else
		{
			System.out.println("Searched element is not found!!!");
		}
		
	}

}
