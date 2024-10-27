/*ii)Calculator Program

1)Addition
2)Substrcation
3)Multiplication
4)Division*/

package ProgramList;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter operand one");
		int n1 = s.nextInt();
		
		System.out.println("Enter operand two");
		int n2 = s.nextInt();
		
		System.out.println("Enter which operation you  want perform");
		System.out.println("type add for addition");
		System.out.println("sub for substraction");
		System.out.println("mul for multiplication");
		System.out.println("div for division");
		
		String operation = s.next();
		
		if (operation.equals( "add")) {
			System.out.println(n1+n2);
		}
		else if(operation.equals( "sub")){
			System.out.println(n1-n2);
		}
		
		else if(operation.equals( "mul")) {
			System.out.println(n1*n2);
		}
		
		else if(operation.equals( "div")) {
			System.out.println(n1/n2);
		}
	}



}
