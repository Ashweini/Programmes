//1)WAJP To Print Even Number Between The Range
package NumberProgrammes;

import java.util.Scanner;

public class EvenNumBtwRange {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the starting range");
		int start = s.nextInt();
		
		System.out.println("Enter the Ending range");
		int EndRange = s.nextInt();
		
		for(int i=start; start<=EndRange; start++) {
			
			if(start%2==0) {
				System.out.println(start);
			}
			
		}
		
		/*int i=1;
		while(i<=10) {
			if(i%2==0) {
				System.out.println(i);
			
			}
			i++;
			
		}*/
	}

}
