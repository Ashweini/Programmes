/*2)Take input from user as integer, check that number is even or odd 
if it is even check that number is divisible by 6 or not.
if it is odd check that number is divisible by 3 or not
 
I/p:-12   O/p:-Given number is even and it is divisible by 6
I/p:-4     O/p:-Given number is even but it is not divisible by 6
I/p:-9     O/p:-Given number is odd and it is divisible by 3
I/p:-13     O/p:-Given number is odd but  it is  not divisible by 3 */


package ProgramList;
import java.util.Scanner;
public class ProgramCheckScenario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("ENter the number");
		int n = s.nextInt();
		
		if(n%2==0) 
		{
			if(n%6==0) {
				System.out.println("given number is even and divisible by 6");
			}
			else {
				System.out.println("given number is even but not divisible by 6");
			}
			
		}
		else
		{
			if(n%3==0) {
				System.out.println("given number is odd and divisible by 3");
			}
			else {
				System.out.println("given number is odd but not divisible by 3");
			}
		}
	}	
}
		
		/*
		 * */
		 
		
		


