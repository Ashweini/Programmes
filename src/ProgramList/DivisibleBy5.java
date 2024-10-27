//4)WAJP check whether the given number is divisible by 5 or not
//I/p:-25     O/p:-Given number is divisible by 5
//I/p:-14    O/p:-Given number is not divisible by 5

package ProgramList;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();	
		
		if(num%5==0) {
			System.out.println(num+ " Given number is divisible by 5");
		}
		else {
			System.out.println(num+ " Given number is not divisible by 5");
		}
	}

}
