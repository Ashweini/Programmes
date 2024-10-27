package Array;

import java.util.Arrays;

public class MissingElementIntheArray {

	public static void main(String[] args) {


		int[] a = {5, 3, 2 ,1};int sum1=0, sum2=0;
		Arrays.sort(a); //inbuilt method to sort

		
		for(int i=0; i<a.length;i++) {
			sum1=sum1+a[i];
		}
		
		
		for(int i=a[0]; i<=a[a.length-1];i++) {
			
			sum2=sum2+i;
		}
	
		
		int missingEle = sum2-sum1;
		System.out.println("Sorted Array : "+Arrays.toString(a));
		System.out.println("Missing ele is : "+missingEle);
	}

}
