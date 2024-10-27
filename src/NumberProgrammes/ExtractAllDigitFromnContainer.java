package NumberProgrammes;

public class ExtractAllDigitFromnContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int n=27586;
		while(n>0) {
			int lastDigit=n%10;
			System.out.println(lastDigit);
			n=n/10;
		}*/
		
		//using for loop
		for(int n=27586; n>0; n=n/10) {
			int lastDigit=n%10;
			System.out.println(lastDigit);		
		}
	
		System.out.println("--------------using do while--------------");
		int m=27586;
		do {
			int lastDigit=m%10;
			System.out.println(lastDigit);
			m=m/10;
			
		}while(m>0);


	}

}
