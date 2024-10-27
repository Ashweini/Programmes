package Array;

public class LargestElementInanArray {

	public static void main(String[] args) {


		int[] a = {52, 125, 5, 90, 6, 135};
		int max = a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println("Largest number in an array : "+max);

	}

}
