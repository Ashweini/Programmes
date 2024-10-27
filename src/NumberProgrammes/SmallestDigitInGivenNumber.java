package NumberProgrammes;

public class SmallestDigitInGivenNumber {

	public static void main(String[] args) {
		int n=789234;
		int min = Integer.MAX_VALUE;
		while(n!=0) {
			int rem=n%10;
			if(rem<min) {
				min=rem;
			}
			n=n/10;
		}
		System.out.println(min);
	}

}
