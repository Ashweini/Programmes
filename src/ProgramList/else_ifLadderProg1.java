//1)WAJP check student is pass or fail based on  student grade ?
//I/p:-'B'    O/p:-Second Class



package ProgramList;

import java.util.Scanner;

public class else_ifLadderProg1 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the grade");
		char grade=s.next().charAt(0);
		
		
		if(grade=='a' || grade=='A' ) {
			System.out.println("First Class");
		}
		else if(grade=='B' || grade=='b') {
			System.out.println("Second Class");
		}
		else if(grade=='C' || grade=='c') {
			System.out.println("Third Class");		
		}
		else if(grade=='D' || grade=='d')
		{
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid grade");
			
		}

	}

}
