package OOPJLAB;
import java.util.*;
public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String sentence=new String();
		System.out.println("Enter the string:");
		sentence=s.nextLine();
		int count=0,flag=0;
		String str=sentence.toLowerCase();
		char[] c =str.toCharArray();
		System.out.println("Enter the element:");
		char element=s.next().charAt(0);
		for(char ch:c)
		{
			if(ch==element)
			{
				count=count+1;
				flag=flag+1;
			}
		}
		if(flag!=0)
		{
			System.out.println("Occurance of "+element+" is "+count+" times ");
		}
		else
		{
			System.out.println("The searched element "+element+" is not found");
		}
		s.close();
	}

}
