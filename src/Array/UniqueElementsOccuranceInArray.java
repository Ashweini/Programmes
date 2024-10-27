package Array;

public class UniqueElementsOccuranceInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10, 2, 10, 2,2,10, 5,5};
		
		for(int i=0; i<a.length;i++) {
			int c=1;
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
					a[j]=Integer.MAX_VALUE;
				}
			}
			if(a[i]!=Integer.MAX_VALUE  && c==1) {
				System.out.println(a[i]+"->"+c);
			}
		}
	}
}


