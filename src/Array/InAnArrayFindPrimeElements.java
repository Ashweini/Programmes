package Array;

public class InAnArrayFindPrimeElements {

	public static void main(String[] args) {
	
		int[] a = {6, 8, 5, 9, 3,2, 12, 14, 15};
		
		System.out.println("Prime Elements are");
		for(int i=0; i<a.length; i++) {
			int n=a[i];
			//check 'n' prime
			int c=0;
				for(int j=1;j<=n;j++ ) {
					if(n%j==0)
					c++;
				}
				if(c==2)
					System.out.println(a[i]);
		}

	}

}
