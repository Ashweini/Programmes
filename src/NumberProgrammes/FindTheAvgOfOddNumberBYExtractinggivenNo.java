package NumberProgrammes;

public class FindTheAvgOfOddNumberBYExtractinggivenNo {

	public static void main(String[] args) {

		int n=856139;
		double sum=0, count=0;
		while(n>0) {		
			int m =n%10;
			if(n%2==1) {
				sum=sum+m;
				count++;
			}
			n=n/10;
		}
		System.out.println(sum);
		System.out.println(count);
		System.out.println("Avg is "+ sum/count); //use double to get 4.5 int will ignore decimal


	}

}
