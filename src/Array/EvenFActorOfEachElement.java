package Array;

public class EvenFActorOfEachElement {

	public static void main(String[] args) {


		int[] a= {6, 12, 2, 13 ,15};
		
		for(int i=0; i<a.length; i++) {
			int n = a[i];	
		System.out.print(n+"->");
		//find factors for n
		boolean flag=false;
		for(int j=1; j<=n; j++) {
			if(n%j==0) {
				//check is even
				if(j%2==0) {
					System.out.print(j+" ");
					flag=true;
				}
			}

		}
		if(flag==false) {
			System.out.print("no even factor");
		}
		System.out.println();
		}

	}

}
