package PracticeQuestions;
import java.util.*;
class ComputeAverage {
int n1,n2,n3;
float avrg;
void average()
{
avrg=(float)(n1+n2+n3)/3;
System.out.println("Average of 3 numbers= "+avrg);
}
}

public class CalcAverage {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
ComputeAverage demo= new ComputeAverage();
System.out.println("Enter the three numbers:\n");
demo.n1=s.nextInt();
demo.n2=s.nextInt();
demo.n3=s.nextInt();
s.close();

}
}
