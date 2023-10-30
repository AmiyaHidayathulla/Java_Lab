package OOPJLAB;
import java.util.*;
public class MatrixMultiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int row1,row2,column1,column2;
		char input;
		do
		{
		System.out.println("Enter the order of matrixA");
		Scanner s=new Scanner(System.in);
		row1=s.nextInt();
		column1=s.nextInt();
		int[][] matrixA=new int[row1][column1];
		System.out.println("Enter the elements of matrix A");
		for(int i=0;i<row1;i++)
		{
		for(int j=0;j<column1;j++)
		{
		matrixA[i][j]=s.nextInt();
		}
		}
		System.out.println("Enter the order of matrixB");
		row2=s.nextInt();
		column2=s.nextInt();
		int[][] matrixB=new int[row2][column2];
		System.out.println("Enter the elements of matrix B");
		for(int i=0;i<row2;i++)
		{
		for(int j=0;j<column2;j++)
		{
		matrixB[i][j]=s.nextInt();
		}
		}
		int[][] matrixC=new int[row2][column1];
		if(row2==column1)
		{
		for(int i=0;i<row1;i++)
		{
		for(int j=0;j<column2;j++)
		{
		matrixC[i][j]=0;
		for(int k=0;k<column1;k++)
		{
		matrixC[i][j]=matrixC[i][j]+(matrixA[i][k]*matrixB[k][j]);
		}
		}
		}
		System.out.println("Matrix C=");
		for(int i=0;i<row2;i++)
		{
		for(int j=0;j<column1;j++)
		{
		System.out.print(matrixC[i][j]+" ");
		}
		System.out.println("\n");
		}
		}
		else
		{
		System.out.println("Multiplication is not possible");
		}
		System.out.println("Do you want to continue?y or n? ");
		 input=s.next().charAt(0);
		}

		while(input=='y'||input=='Y');
}
}

