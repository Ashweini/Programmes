//WAJT find Strong Number
//Strong Number : some of factorial of each digit = given number 
package NumberProgrammes;
public class StrongNumbers {

	public static void main(String[] args) {
		
		int n=145; int sum=0; int temp=n;
		while(n>0) {
			int rem=n%10;
			//find factorial for rem
			int fact =1;
			for(int i=1; i<=rem;i++) {
				fact = fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		System.out.println(temp+"->"+sum);
		if(temp==sum)
			System.out.println("Strong Number");
	}

}
