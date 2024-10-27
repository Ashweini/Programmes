package Array;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {


		int[] a= {1, 2, 3, 4 ,5};
		int[] b= {6, 7, 8, 9, 10}; int j=0;
		int[] c= new int[a.length+b.length];
		
		for(int i=0; i<c.length; i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
			else {
				c[i]=b[j];
				j++;
			}
		
		}
		System.out.println(Arrays.toString(c));
	}

}
