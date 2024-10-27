package Array;

import java.util.Arrays;

public class MissingElementInRange {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 6, 7, 8, 10};
		int j=a[0];
		int i = 0;
		System.out.println(Arrays.toString(a));
		System.out.print("Missing element : ");
		
			while(i<a.length) {
				if(j==a[i]) {
					i++;j++;
				}
				else {
					System.out.print(j+" ");
					j++;
				}
			}
			
//			System.out.println(Integer.MAX_VALUE);
//			System.out.println(Integer.MIN_VALUE);
//			
//			System.out.println(Byte.MAX_VALUE);
//			System.out.println(Byte.MIN_VALUE);

	}

}
