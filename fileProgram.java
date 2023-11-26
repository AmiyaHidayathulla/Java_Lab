package OOPJLAB;
import java.io.*;
import java.util.Scanner;
public class FileProgram 
{
	public static void main(String[] args) throws IOException
	{
		int i;
		String se;
		Scanner sc=new Scanner(System.in);
		
	    File f1=new File("sample2.txt");
		if(f1.exists()) 
		{
			System.out.println("File Exists");
		}
		else 
		{
			f1.createNewFile();
			System.out.println("File created: " + f1.getName());
		}
	
		System.out.println("Enter the contents of the file sample.txt:");
		String s=sc.nextLine();
	
		   FileWriter obj1=new FileWriter("sample2.txt");
		   
		   obj1.write(s);
		   obj1.close();
	
		try {
	
		   FileReader obj2=new FileReader("sample2.txt");
		   char[] content=new char[100];
		   
		   obj2.read(content);
		   obj2.close();
		   
		   FileWriter obj3=new FileWriter("new-sample2.txt");
		   obj3.write(content);
		   obj3.close();
		   
		   FileReader obj4=new FileReader("new-sample2.txt");
		   BufferedReader br=new BufferedReader(obj4);
		   System.out.print("Contents of new-sample2.txt:");
		   
		   while((se=br.readLine())!=null){
		    System.out.println(se);
		   }
		   
		}
		catch(Exception e) {
		System.out.println(e.getMessage());
		}
	}
	}

