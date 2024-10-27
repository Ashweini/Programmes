//Armstrong Number - PowerOfEachDigit

package NumberProgrammes;
public class _01_08_Assgn_ArmStrongNumber {

	public static void main(String[] args) {
		int n=1634, ex=0,rem=0; int temp=n, base=temp;
		while(n>0) {
		    //rem=n%10;
			ex++;
			n=n/10;
		}
		System.out.println("Exponential is "+ex);
		
		int sum=0;
		while(temp>0) {
			rem=temp%10;
			int power=1;
			for(int i=1; i<=ex;i++) {
			power = power*rem;
		}
		sum=sum+power;
		temp=temp/10;
		System.out.println(rem+" exponential of "+ex+" is "+power);
		}
		System.out.println(base+"->"+sum);
		if(sum==base)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong number");
	}

}
