//3)WAJP check given number is even or odd 
//I/p:-4   O/p:Even number
//I/p:-9   O/p:-Oddnumber

package ProgramList;

import java.util.Scanner;

public class OddOREven {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();	
		
		if (num%2==0) {
			System.out.println(num+" Event number");
		}
		else {
			System.out.println(num+ " Odd Number");
		}

	}

}
