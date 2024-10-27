package NumberProgrammes;

public class _06_08_LCM {

	public static void main(String[] args) {

		int n1=7, n2=2;
		int LCM = n1>n2? n1: n2;
		
		//check 'lcm' is completely divisible by n1 and n2
		while(true) {
			if(LCM%n1==0 && LCM%n2==0) {
				break;
			}
		LCM++;
		}
		System.out.println(LCM);
	}
}