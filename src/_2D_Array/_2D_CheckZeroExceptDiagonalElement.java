package _2D_Array;

import java.util.Scanner;

public class _2D_CheckZeroExceptDiagonalElement {
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
	//------------------------------------------------------------------------
		//System.out.println("diagonal elements");
		boolean flag=true;
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				if(i!=j && a[i][j]==0) {
				}
				else if(i!=j) {
					flag=false;
					break;
				}
			}		
		}
		if(flag==true) {
			System.out.println("Except Diagonals element all elemts are zero");
		}else {
			System.out.println("Except Diagonals element all elemts are not zero");
		}
}
}