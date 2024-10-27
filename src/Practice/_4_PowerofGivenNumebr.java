package Practice;

public class _4_PowerofGivenNumebr {

	public static void main(String[] args) {
		int n=4, n2=3,power=1;
		while(n2>0) {
			power=power*n;
			n2--;
		}
		System.out.println("power of "+n+" is "+power);

	}

}
