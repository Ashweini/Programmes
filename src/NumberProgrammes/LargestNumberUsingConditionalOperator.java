package NumberProgrammes;

public class LargestNumberUsingConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=3;
		int b=5;
		int c=10;
		int res= (a>b) && (a>c) ?a:(b>c)?b:c;
		
		System.out.println(res);
		
		
	}

}
