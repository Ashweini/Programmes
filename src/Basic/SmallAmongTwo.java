package Basic;

import java.util.Scanner;

public class SmallAmongTwo {

	public static void main(String[] args) {
		
		
		System.out.println("Enter 2 number");
		Scanner s= new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		String res= a<b? +a+" is small": +b+" is small";
		System.out.println(res);
	
	}

}
