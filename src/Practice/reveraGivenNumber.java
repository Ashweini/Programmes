package Practice;

public class reveraGivenNumber {

	public static void main(String[] args) {
		int n=123,temp=n, rev=0;
		while(n>0) {
			int rem=n%10;
			rev = rev*10+rem;
			n=n/10;
		}
		System.out.println("reverse of "+temp+" is "+rev);

	}

}
