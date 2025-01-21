package ExamPractice;

import java.util.*;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		char input;
		do
		{
			System.out.println("Enter the String: ");
			
			String str=sc.next();
			String reverse="";
			for(int i=str.length()-1;i>=0;i--)
			{
				reverse=reverse+str.charAt(i);
			}
			if(str.equalsIgnoreCase(reverse))
			{
				System.out.println("word "+str+" is palindrome\n");
			}
			else
			{
				System.out.println("word "+str+" is not palindrome\n");
			}
		System.out.print("Do you want to continue?Y/N: ");
		input=sc.next().charAt(0);
		}
		while(input=='Y'||input=='y');	
		sc.close();
		}
}
