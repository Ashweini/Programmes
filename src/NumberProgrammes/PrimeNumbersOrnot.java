package NumberProgrammes;

public class PrimeNumbersOrnot {

	public static void main(String[] args) {
		int n=5, count =0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println(count);
		if(count==2) {
			System.out.println(n+" is a Prime Number");
		}
		else {
			System.out.println(n+" is a not Prime Number");
		}

	}

}
