package Array;

import java.util.Arrays;

public class SearchGivenElementByUsingBinarySearch {

	public static void main(String[] args) {


		int[] a= {5, 6, 30, 35, 70, 90, 99};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		//declare variable
		int l=0, r=a.length-1;
		boolean flag=false;
		int ele=90;
		
		while(l<=r) {
			int mid=(l+r)/2;
			if(ele==a[mid]) {
				flag = true;
				break;
			}
			else if(ele>a[mid]) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
				
		}
		if(flag==true)
			System.out.println("element found");
		else
			System.out.println("element not found");

	}

}
