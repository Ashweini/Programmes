//if - 2)	WAJP to check given number is positive or not?

package ProgramList;

import java.util.Scanner;

public class PositiveOrNot {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		if (num>0)
		{
			System.out.println(num+" Given number is positive");
		}
		else {
			System.out.println(num+" Given number is Negative");
		}


	}

}
