package NumberProgrammes;

public class RemoveAllBUmberfromGiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=835916, count=0;
		while(n>0) {
			System.out.println(n);
			n = n/10;
			count++;
		}
		System.out.println("n value is "+n);
		System.out.println(count);

	}

}
