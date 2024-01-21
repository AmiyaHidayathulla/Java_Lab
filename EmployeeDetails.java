package PracticeQuestions;
import java.util.Scanner;
class EmployeeInfo {
Scanner s=new Scanner(System.in);
String[] name= new String[2];
String[] address=new String[2];
float[] salary=new float[2];
int[] year=new int[2];
void AskData()
{
for(int i=0;i<2;i++)
{
System.out.println("name: ");
name[i]=s.next();
System.out.println("address: ");
address[i]=s.next();
System.out.println("Year: ");
year[i]=s.nextInt();
System.out.println("salary: ");
salary[i]=s.nextInt();

}
}
void DisplayData()
{
for(int i=0;i<2;i++)
{
System.out.println("NAME: "+name[i]);
System.out.println("ADDRESS: "+address[i]);
System.out.println("YEAR: "+year[i]);
System.out.println("SALARY: "+salary[i]);
System.out.println("");
}
}
}

public class EmployeeDetails {

public static void main(String[] args) {
// TODO Auto-generated method stub
EmployeeInfo employ=new EmployeeInfo();
System.out.println("Enter the details of 2 employees:\n");
employ.AskData();
employ.DisplayData();
}

}
