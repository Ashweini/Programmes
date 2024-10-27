package Array;

public class SecondLargestElementInArray {

	public static void main(String[] args) {

		int[] a = {52, 125, 5, 90, 6, 135};
		int max = a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("Largest number in an array : "+max);
		
		int max2=a[0];
		for(int i=0; i<a.length;i++) {
				if(a[i]>max2 && a[i]!=max) {
					max2=a[i];
				}
		}
		System.out.println("Second Largest Number : "+max2);
		

	}

}
