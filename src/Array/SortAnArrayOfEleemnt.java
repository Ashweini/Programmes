package Array;

import java.util.Arrays;

public class SortAnArrayOfEleemnt {

	public static void main(String[] args) {


		int[] a= {5, 2, 1, 8, 3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(Arrays.toString(a));
		}
		System.out.println("-----------------------------------------");
		System.out.println(Arrays.toString(a));
	}

}
