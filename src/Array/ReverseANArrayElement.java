package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseANArrayElement {

	
	public static void main(String[] args) {

		//int[] a = {6, 8, 5, 9, 3,2, 12, 14, 15};
		int[] a = {1,2,3,4,5};
		int[] b = new int[a.length];
		int j=0;
		
		for(int i=a.length-1; i>= 0; i--) {
			b[j]=a[i];
			j++;
		}
		System.out.println(Arrays.toString(b));

	}

}
