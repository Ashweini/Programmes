/* 5)	Nested if
1)Check Person is eligible for  donate blood or not
I/p:-weight 50 , bgroup O+
}
}*/


package ProgramList;

import java.util.Scanner;

public class NestedIfProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter weight");
		int weight = s.nextInt();
		
		
		
		if(weight>=45 ) {
			
			System.out.println("Enter blood group");
			String bgroup = s.next();
			if(bgroup.equals("O+"))
			{
				System.out.println("Person is eligible for  donate blood");
			}
			else {
				System.out.println("blood group is not matching");
			}
		}
		else {
			System.out.println("Weight should be more than 45kg");
		}
	}

}
