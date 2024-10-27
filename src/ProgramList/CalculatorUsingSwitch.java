package ProgramList;

import java.util.Scanner;

public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);		
		System.out.println("Enter Choice");
		System.out.println("1 for Addition\n2 for substraction\n3 for multiplication\n4 for division");		
		int choice = s.nextInt();
		int n1 ;
		int n2;
		
		
		switch(choice) {
		case 1:
			System.out.println("Enter 2 number");
			n1 = s.nextInt();
			n2 = s.nextInt();
			System.out.println(n1+n2);
			break;
			
		case 2:
			System.out.println("Enter 2 number");
			n1 = s.nextInt();
			n2 = s.nextInt();
			System.out.println(n1-n2);
			break;
			
		case 3:
			System.out.println("Enter 2 number");
			n1 = s.nextInt();
			n2 = s.nextInt();
			System.out.println(n1*n2);
			break;
		case 4:
			System.out.println("Enter 2 number");
			n1 = s.nextInt();
			n2 = s.nextInt();
			System.out.println(n1/n2);
			break;
		default: System.out.println("Invalid choice");
	}
	}

}
