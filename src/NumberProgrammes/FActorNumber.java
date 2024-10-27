//WAJPT factor num: factor no which divides given no completely without giving any remainder. 6-> 1,2,3,6

package NumberProgrammes;
public class FActorNumber {

	public static void main(String[] args) {
		int n=20;
		System.out.print(n+"->");
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+",");
			}
		}

	}

}
