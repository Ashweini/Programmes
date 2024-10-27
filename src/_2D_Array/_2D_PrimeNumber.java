package _2D_Array;

import java.util.Scanner;

public class _2D_PrimeNumber {

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
		//System.out.println("Array elements are : ");
		
		//int c = 0;
		for(int i=0;i<row;i++) {
			for(int j=0; j<col;j++) {
					int n = a[i][j];
					//check n is prime
					int c = 0;
					for(int k=1;k<=n;k++) {
						if(n%k==0) {
							c++;
						}
					}
					if(c==2) {
						//System.out.print("Prime elements are : ");
						System.out.print(a[i][j]+" ");
					}
			}
			System.out.println();
		
		}

	}

}
