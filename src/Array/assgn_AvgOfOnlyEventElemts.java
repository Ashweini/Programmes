package Array;

public class assgn_AvgOfOnlyEventElemts {

	public static void main(String[] args) {
		int[] a = {69, 89, 45, 90, 69,89, 79, 86, 45};
		int sum=0,count=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				sum = sum+a[i];
				count++;
			}
		}
		System.out.println("Avg value is : "+sum/count);

	}

}
