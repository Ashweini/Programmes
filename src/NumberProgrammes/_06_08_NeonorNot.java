package NumberProgrammes;

public class _06_08_NeonorNot {

	public static void main(String[] args) {

		int n=9; int prod=n*n;int sum=0;
		while(prod>0) {
			int rem=prod%10;
			sum = sum+rem;
			prod=prod/10;
		}
		System.out.println(n+"->"+sum);
		if(n==sum) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("Not a neon number");
		}

	}

}
