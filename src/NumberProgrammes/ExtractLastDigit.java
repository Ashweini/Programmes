package NumberProgrammes;

public class ExtractLastDigit {

	public static void main(String[] args) {


		int n=27586;
		//System.out.println(n/10);// /10(quotient) - remove last digit from given number
		int remainder = n%10;
		System.out.println(remainder);  // %10- gives remainder as result which is last digit 

	}

}
