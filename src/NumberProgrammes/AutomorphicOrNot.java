package NumberProgrammes;

public class AutomorphicOrNot {

	public static void main(String[] args) {
		int n = 25; int sq=n*n;
		System.out.println(n+"->"+sq);
		
		while(n>0) {
			int r1=n%10; int r2=sq%10;
			if(r1==r2) {
				n=n/10; sq=sq/10;
			}
			else {
				break;
			}
		}
		if(n==0) {
				System.out.println("Automorphic");
			}
			else {
				System.out.println("not a automorphic");
			}
}
}