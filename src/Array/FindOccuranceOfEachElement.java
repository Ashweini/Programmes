package Array;

public class FindOccuranceOfEachElement {

	public static void main(String[] args) {
		int[] a = {10, 2, 10, 2,2,10, 5,5, 4};
		
		for(int i=0; i<a.length;i++) {
			int c=1;
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;
					a[j]=Integer.MAX_VALUE;
				}
			}
//			System.out.println(a[i]+"->"+c);
			if(a[i]!=Integer.MAX_VALUE && c>1)
					System.out.println(a[i]+"->"+c);
		}
		
		
		
		
		
		
		
//		int i=0;
//		int j=a[1];
//		while(i<a.length) {
//			int c=1;
//			while(j<a.length-1) 
//			{ 
//				
//				if(a[i]==a[j]) {
//					c++;
//					a[j]=Integer.MAX_VALUE;
//				}
//				else {
//					j++;
//				}
//			}
//			if(a[i]!=Integer.MAX_VALUE) {
//				System.out.println(a[i]+"->"+c);
//			}
//			i++;
//		}

		
	}

}
