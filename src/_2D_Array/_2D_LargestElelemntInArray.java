package _2D_Array;

import java.util.Scanner;

public class _2D_LargestElelemntInArray {

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
		int max=0;
		System.out.println("Array elements are : ");
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
				System.out.print(a[i][j]+" ");			
				max = a[0][0];
				for(int k=0; k<a.length;k++) {
					for(int l=0; l<a.length;l++) {
					if(a[k][l]>max) {
						max = a[k][l];
					}
				}
				}
				
			}
			System.out.println();

		}
		System.out.println("Largest number in an array : "+max);

	
}
}
