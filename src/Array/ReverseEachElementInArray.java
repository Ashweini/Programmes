package Array;

import java.util.Arrays;

public class ReverseEachElementInArray {

	public static void main(String[] args) {


		int[] a = {572, 123, 52, 96, 82};
		
		for(int i=0; i<a.length;i++) {
//			int n=a[i];
//			//reverse each element
//			int rev=0;
//			while(n>0) {
//				int rem = n%10;
//				rev = rev*10+rem;  
//				n=n/10;
//			}
//			System.out.println(rev);
//		}
			int rev=0;
			while(a[i]>0) {
				int rem = a[i]%10;
				rev = rev*10+rem;  
				a[i]=a[i]/10;
			}
			System.out.print((rev)+", ");
		}
	}

}
