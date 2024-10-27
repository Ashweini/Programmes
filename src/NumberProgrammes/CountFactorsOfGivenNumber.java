package NumberProgrammes;

public class CountFactorsOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=6, count =0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		System.out.println("factors of "+n +" is "+count);

	}

}
