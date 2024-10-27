package _2D_Array;
import java.util.Arrays;
import java.util.Scanner;

public class _2DArray {

	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of col");
		int col=s.nextInt();
		System.out.println("Enter the size of row");
		int row=s.nextInt();
		
		int[][] a=new int[row][col];
		
		System.out.println("enter array elements");
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Array elements are : ");
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
	}
		
	}	

}
