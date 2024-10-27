package Practice;

public class extractAllDigitGivenNumber {

	public static void main(String[] args) {
		int n=2567, c=0, sum=0;
		System.out.println(n+" n value before");
		while(n>0) {  //=0 runs infinitly 
			int rem = n%10;
			System.out.println("removed digit : "+rem);
			n=n/10;
			c++;
			sum = sum+rem;
		}
		System.out.println(n+" after removal");
		System.out.println("count of values: "+c);
		System.out.println("sum of digits : "+sum);
		
		

	}

}
