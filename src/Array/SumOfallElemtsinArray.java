package Array;

import java.util.Scanner;

public class SumOfallElemtsinArray {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter size of an array");
//		int size = sc.nextInt();
//		
//		int[]  a = new int[size];
//		System.out.println("Enter array elements");
//		
//		//iterate through size to get array element 
//		for(int i=0; i< a.length; i++) {
//			a[i] = sc.nextInt();
//		}
//		
//		//print array of data 
//		int sum=0;
//		for (int i=0; i< a.length;i++ ) {
//			sum = sum+a[i];
//		}
//		
//		System.out.println(sum);
		
		int sum=0;
		int[] a= {10, 20, 4, 5, 6, 78, 87};
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
	}
		System.out.println(sum);

	}

}
