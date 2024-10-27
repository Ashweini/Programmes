////WAJPT factor num: factor no which divides given no completely without giving any remainder. 6-> 1,2,3,6
//between 1 to 10

package NumberProgrammes;
public class Factorsfrom1to10 {
	public static void main(String[] args) {
		// ctrl+shift+F

		for (int n = 1; n <= 10; n++) {
			System.out.print(n + "->");
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					System.out.print(i + ",");
				}
			}
			System.out.println();
		}
	}

}
