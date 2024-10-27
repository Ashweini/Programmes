package Array;

public class SmallestElementInanArraay {

	public static void main(String[] args) {

		int[] a = {52, 125, 5, 90, 6, 135};
		int min = a[0];
		for(int i=0; i<a.length;i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("Largest number in an array : "+min);


	}

}
