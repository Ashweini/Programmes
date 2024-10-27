package Practice;

public class EvenDigitOddDigitInGivenNumber {

	public static void main(String[] args) {
		int n=2567;
		while(n>0) {
			int rem = n%10;
			if(rem%2==0)
				System.out.println(rem+" Even Number");
			else
				System.out.println(rem+" Odd Number");
			n=n/10;
		}

	}

}
