package Practice;

public class _2_FactPfEachDigit {

	public static void main(String[] args) {
		int n= 524;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			for(int i=1; i<=rem;i++) {
				fact=fact*i;
				//System.out.println(fact);
			}
			System.out.println("fact of "+rem+" is "+fact+" ");
			n=n/10;
		}

	}

}
