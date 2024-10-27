package Array;

import java.util.Scanner;

public class PrintEvenOddElement {

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
//		for (int i=0; i< a.length;i++ ) {
//			if(a[i]%2==0)
//			System.out.println("event number " +a[i]);
//			else
//				System.out.println("odd Number "+a[i]);
//		}
		
		//even number 
//		int[] a= {10, 20, 4, 5, 6, 78, 87};
//		for(int i=0; i<a.length; i++) {
//			if(a[i]%2==0) 
//				System.out.println(a[i]);
//	}
//		
		//Odd Number
		int[] a= {10, 20, 4, 5, 6, 78, 87};
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==1) 
				System.out.println(a[i]);
	}

}
	
}
