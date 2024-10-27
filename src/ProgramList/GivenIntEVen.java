//if - 1)	WAJP to check whether an given integer number is even ,if even print "hi"  if not do nothing?

package ProgramList;
import java.util.Scanner;
public class GivenIntEVen {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		if(num%2==0)		
			System.out.println("hi");

	}

}
