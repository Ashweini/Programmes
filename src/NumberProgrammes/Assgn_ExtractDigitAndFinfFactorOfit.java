package NumberProgrammes;

public class Assgn_ExtractDigitAndFinfFactorOfit {

	public static void main(String[] args) {

		int n=589;
		while(n>0) {
			int rem=n%10;
			System.out.print(rem+"->");
			
		//find the factor of rem	
		for(int i=1; i<=rem; i++) {
			if(rem%i==0) {
				System.out.print(i+" ");
			}
		}
		n=n/10;
		System.out.println();
		}
	}

}
