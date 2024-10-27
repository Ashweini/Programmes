//3)WAJP To Print Odd Number Between The Range
package ProgramList;

import java.util.Scanner;

public class OddNumBtwRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the starting range");
		int start = s.nextInt();
		
		System.out.println("Enter the Ending range");
		int EndRange = s.nextInt();
		
		for(int i=start; start<=EndRange; start++) {
			
			if(start%2!=0) {
				System.out.println(start);
			}
			
		}


	}

}
