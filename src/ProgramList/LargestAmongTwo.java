// if - else -> 2)WAJP find largest among two number I/p:-10,20   O/p: 20

package ProgramList;

import java.util.Scanner;

public class LargestAmongTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter 1st number");
		int a = sc.nextInt();
		System.out.println("Please enter 2nd number");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a+" is larger");
		}
		else {
			System.out.println(b+" b is larger");
		}
	
	}

}
