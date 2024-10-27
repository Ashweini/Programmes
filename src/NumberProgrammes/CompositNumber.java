package NumberProgrammes;

public class CompositNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3, count =0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		//System.out.println(count);
		if(count>2) {
			System.out.println(n+" is a composit Number");
		}
		else {
			System.out.println(n+" prime number");
		}


	}

}
