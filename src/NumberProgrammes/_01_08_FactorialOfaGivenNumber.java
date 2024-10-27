//factorial of a given number 

package NumberProgrammes;
public class _01_08_FactorialOfaGivenNumber {
	public static void main(String[] args) {
		
		int n=5, fact=1;
		for(int i=1; i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("Factorial of a "+n+"->"+fact);
	}
}
