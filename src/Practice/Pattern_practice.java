package Practice;

public class Pattern_practice {

	public static void main(String[] args) {
		int n=7;
//doubt		
//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
////				if(i==j ) {
////				System.out.print("*");
////				}
//				if(i==n || j==n)
//				System.out.print("* ");
//			}
//			System.out.println(" ");
//		}
//===============================================practice
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if((i>=j && i+j<=2*n) || 
						(j>=i && i+j>=2*n)){
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
