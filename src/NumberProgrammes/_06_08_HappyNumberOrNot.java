package NumberProgrammes;

public class _06_08_HappyNumberOrNot {

	public static void main(String[] args) {
		int n=29; 
		while(true) {
			int sum =0;
			while(n>0) {
				int rem=n%10;
				int sq = rem*rem;
				sum = sum+sq;
				n=n/10;
			}
			if(sum==1) {
				System.out.println("Happy number");
				break;
			}
			else if(sum==4) {
				System.out.println("sad number");
				break;
			}
			else {
				System.out.println(sum+": Original number assign back to n");
				n=sum;
			}
			
		}
	}
}
