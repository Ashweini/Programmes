package NumberProgrammes;

public class PrimeOrCompositNumber {

	public static void main(String[] args) {
		for(int n=1;n<=10;n++) { 
			int count =0;
			for(int i=1; i<=n; i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(n+" -> co prime");
			}
			else if(count==2) {
				System.out.println(n+" -> Prime Number");
			}
			else {
				System.out.println(n+" -> composit Number");
			}
		
	}

	}

}
