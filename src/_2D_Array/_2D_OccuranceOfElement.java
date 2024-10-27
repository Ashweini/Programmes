package _2D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _2D_OccuranceOfElement {

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
		System.out.println("---------------------------------------------");
//-----------------------------Occurance Of element In an Array------------------------------------------------//
		
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				int c=0;
				for(int k=0; k<row; k++) {
					for(int l=0; l<col; l++) {
						if(a[i][j]==a[k][l]) {
							c++;
							if(c>1) {
								a[k][l]=Integer.MAX_VALUE;
							}
						}
					}
				}
				if(a[i][j]!=Integer.MAX_VALUE)
					System.out.println(a[i][j]+"->"+c);
			}
			
		}
	}

}
