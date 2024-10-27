package Practice;

public class spyNumberOrnot {

	public static void main(String[] args) {
		int n=124, sum=0, prod=1;
		while(n>0) {
			int rem = n%10;
			sum = rem + sum;
			prod = prod*rem;
			n=n/10;
		}
		if(sum==prod)
			System.out.println("spy number");
		else
			System.out.println("Not a spy number");
		

	}

}
