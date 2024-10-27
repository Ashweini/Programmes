package _2D_Array;

import java.util.Scanner;

public class _2D_Sum {

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
		int sum=0;
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
					System.out.print(a[i][j]+" ");
					sum = a[i][j]+sum;
			}
			System.out.println();
		
		}
		System.out.println("sum is : "+sum);

	}

}
