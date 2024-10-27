package Practice;

public class avgOfGivenNumber {

	public static void main(String[] args) {
		int n=856139,temp=n,sum=0, c=0;
		while(n>0) {
			int rem = n%10;
			sum = sum+rem;
			c++;
			n=n/10;
		}
			
		System.out.println("avg of "+temp+" is "+sum/c);

	}

}
