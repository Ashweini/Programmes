package Practice;

public class PerfectNumber_SumOfFactorExpectThatNumber {

	public static void main(String[] args) {
		int n=7,temp=n;int sum=0;
		for(int i=1; i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==temp)
			System.out.println("perfect number");
		else
			System.out.println("not a perfect number");

	}

}
