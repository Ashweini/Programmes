//WAJPT to find perfect number
//Perfect no : sum of factor except that number = Given number 

package NumberProgrammes;
public class PerfectNum {
	public static void main(String[] args) {

		int n = 28, sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum+"->"+n);
		if (sum == n) {
			System.out.println("Perfect number");
		}
		else{
			System.out.println("not a perpect number");
		}
	}

}


