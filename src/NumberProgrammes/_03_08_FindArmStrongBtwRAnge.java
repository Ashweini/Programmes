//try this
package NumberProgrammes;

public class _03_08_FindArmStrongBtwRAnge {

	public static void main(String[] args) {

		int ex=0,rem=0; int sum=0;
		//int n=1634, 
		for(int n1=1; n1<=1000; n1++) {		
				int n=n1;int temp=n;int base=temp;
				while(n>0) {
			    //rem=n%10;
				ex++;
				n=n/10;
			}
			//System.out.println("Exponential is "+ex);
			
			//int sum=0;
			while(temp>0) {
				rem=temp%10;
				int power=1;
				for(int i=1; i<=ex;i++) {
				power = power*rem;
			}
			sum=sum+power;
			temp=temp/10;
			}
			System.out.println(sum);
			if(sum==base)
				System.out.println(base);
		}
		
		
	}
}
