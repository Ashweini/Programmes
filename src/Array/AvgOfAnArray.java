package Array;

public class AvgOfAnArray {

	public static void main(String[] args) {


		int[] a = {69, 89, 45, 90, 69,89};
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
	}
		System.out.println("Avg value is : "+sum/a.length);
		

	}

}
