package NumberProgrammes;

import java.util.Scanner;

public class WelcomEDowhile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        char choice;//using inside do while variable should be global
		do {
			System.out.println("Welcome..");
			System.out.println("Do you want me to repeat again press 1 for yes 2 for No");
			choice=s.next().charAt(0);
		}while(choice=='1');
		System.out.println("Thank you");
	}

}
