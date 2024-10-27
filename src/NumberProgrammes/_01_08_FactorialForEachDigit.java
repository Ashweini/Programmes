//WAJP to find Factorial of extarcting each digit in a given number 

package NumberProgrammes;
public class _01_08_FactorialForEachDigit {

	public static void main(String[] args) {
		int n=524; 
		while(n>0) {
			int rem=n%10;
			//find factorial for rem
			int fact =1;
			for(int i=1; i<=rem;i++) {
				fact = fact*i;
			}
			System.out.println("Factorial of a "+rem+"->"+fact);
			n=n/10;
		}

	}

}
