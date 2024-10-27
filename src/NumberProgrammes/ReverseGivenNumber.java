package NumberProgrammes;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		int n=12321, rev=0;
		while(n>0) {
			int rem = n%10;
			rev = rev*10+rem; //* with 10 to shift the places 
			n=n/10;
		}
		System.out.println(rev);
	}

}
