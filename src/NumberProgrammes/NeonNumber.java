package NumberProgrammes;

public class NeonNumber {

	public static void main(String[] args) {
		int n=9;
		int sq=n*n; int sum=0;
		System.out.println(n+"->"+sq);
		
		while(sq>0) {
			int rem=sq%10;
			sum = sum+rem;
			sq=sq/10;
		}
		System.out.println(n+"->"+sum);
		if(sum==n) {
			System.out.println("Neon number");
		}

	}

}
