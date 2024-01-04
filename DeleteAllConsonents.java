package PracticeQuestions;


import java.util.*;
public class DeleteAllConsonents {

public static void main(String[] args) {
// TODO Auto-generated method stub
System.out.println("Enter the String:\n");
Scanner s=new Scanner(System.in);
String str=new String();
str=s.nextLine();
String str1=str.toLowerCase();
char[] c=str1.toCharArray();
for(char ch1:c)
{
if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||ch1==' ')
{
System.out.print(ch1);
}
}
}
}
