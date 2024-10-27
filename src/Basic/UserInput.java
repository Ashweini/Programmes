package Basic;

import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char ch;
	    do
		{	  
			System.out.println("Welcome...");
			System.out.println("Do you want to repeat again please type Y/N");
			System.out.println("Type y for yes and type n for No");			
			ch = sc.next().charAt(0);
		}while(ch== 'y');
	    System.out.println("Thank you you responded No");


	}

}
