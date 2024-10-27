package NumberProgrammes;

public class _06_08_NeonBtwRange {

	public static void main(String[] args) {

        for(int n=1; n<=1000;n++) {
			int prod=n*n;int sum=0;
			while(prod>0) {
				int rem=prod%10;
				sum = sum+rem;
				prod=prod/10;
			}
			if(n==sum) {
			System.out.println(n+"->"+sum);
			}
        }
	}

}
