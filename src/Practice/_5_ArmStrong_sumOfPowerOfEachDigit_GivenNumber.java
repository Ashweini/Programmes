package Practice;

public class _5_ArmStrong_sumOfPowerOfEachDigit_GivenNumber {

	public static void main(String[] args) {
		int n=153, ex=0, n1=n, sum=0, temp=n;
		while(n>0) {
			ex++;
			n=n/10;
		}
		
		while(n1>0) {
			int base = n1%10;
			
			//find power of extracted digit
			int pow=1;
			for(int i=1; i<=ex;i++) {
				pow=pow*base;
			}	
			n1=n1/10;
			sum=sum+pow;
			System.out.println(base+"->"+pow);
		}
		System.out.println("----------------");
		System.out.println(temp+"->"+sum);
		
	}

}
