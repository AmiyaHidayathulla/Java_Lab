package OOPJLAB;
import java.util.*;
public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		char input;
		do
		{
			System.out.println("Enter the string to check whether it is palindrome or not: ");
			Scanner s=new Scanner(System.in);
			String word=s.nextLine();
			String reverse="";
			for(int i =word.length()-1;i>=0;i--)
			{
				reverse=reverse+word.charAt(i);
			}
			if(word.equalsIgnoreCase(reverse))
			{
				System.out.println("The searched word "+word+" is palindrome\n");
			}
			else
			{
				System.out.println("The searched word "+word+" is not a palindrome\n");
			}
			System.out.println("Do you want to continue?y or n? ");
			input=s.next().charAt(0);
		}
		while(input=='y'||input=='Y');
		
	}
}
