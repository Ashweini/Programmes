//2)WAJP Take input from user as character ,check that character 
//belong to uppercase or lower case or number or special character
//I/p:-'A'    O/p:-Uppercase
//I/p:-'$'     O/p:-Special character

package ProgramList;
import java.util.Scanner;
public class elseifLadderprog2 {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch=s.next().charAt(0);
		
		//char ch='p';
		
		if(ch>='A'&& ch<='Z') {
			System.out.println("UpperCase");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println("Lower case");
		}
		else if(ch >= '0' ) {
			System.out.println("NUmber");
		}
		else 
		{
			System.out.println("Special character");
		}
			

		
	}

}
