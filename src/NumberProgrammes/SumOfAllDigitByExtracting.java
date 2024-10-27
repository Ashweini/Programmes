package NumberProgrammes;

public class SumOfAllDigitByExtracting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=987654, sum=0;
		while(n>0) {
			int m =n%10;
			sum=sum+m;
			n=n/10;
		}
		System.out.println(sum);

	}

}
