package Array;

import java.util.Scanner;

public class UserInputCReateArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of an array");
		int size = sc.nextInt();
		
		int[]  a = new int[size];
		System.out.println("Enter array elements");
		
		//iterate through size to get array element 
		for(int i=0; i< a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		//print array of data 
		for (int i=0; i< a.length;i++ ) {
			System.out.println(a[i]);
		}
		
		
		//ARrayIndexOutOfBoundException
		//1. when index is <0 - -1, -2
		//2. when index == length
		//3. if the index is greater than length
		

	}

}
