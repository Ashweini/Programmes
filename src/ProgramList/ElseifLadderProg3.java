//3)WAJP take input from user as integer based on that number print particular month
//I/p:-6   O/p:-June


package ProgramList;

import java.util.Scanner;

public class ElseifLadderProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the inter from 1 to 12 which month you want");
		int i=s.nextInt();
		
		if (i==1) {
			System.out.println("January");
		}
		else if (i==2) {
			System.out.println("Febraury");
		}
		else if (i==3) {
			System.out.println("March");
		}
		else if (i==4) {
			System.out.println("April");
		}
		else if (i==5) {
			System.out.println("May");
		}
		else if (i==6) {
			System.out.println("June");
		}
		else if (i==7) {
			System.out.println("July");
		}
		else if (i==8) {
			System.out.println("August");
		}
		else if (i==9) {
			System.out.println("September");
		}
		else if (i==10) {
			System.out.println("October");
		}
		else if (i==11) {
			System.out.println("November");
		}
		else if (i==12) {
			System.out.println("December");
		}
		else {
			System.out.println("You enter invalid Month pls enter between 1 to 12");
		}
		
		
		
		/*switch(i) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febraury");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("You enter invalid Month pls enter between 1 to 12");*/
			
		
	}

}
