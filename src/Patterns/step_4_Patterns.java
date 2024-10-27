package Patterns;

public class step_4_Patterns {

	public static void main(String[] args) {
		System.out.println("-----------upper pyramid-------------");
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("-----------down pyramid-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i<=j && i+j<=2*n) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("-----------left pyramid-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=n; j++) {
				if(i>=j && i+j<=2*n) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		System.out.println("-----------right pyramid-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j>=n+1 && i-j<=n-1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("-----------combination of upper and down  pyramid-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i+j>=n+1 && j-i<=n-1 && i-j<=n-1 && i+j<=3*n-1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		System.out.println("-----------combination of left and right  pyramid-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i>=j && i+j<=n*2 || i+j>=n*2 && j>=i) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		System.out.println("-----------Plus-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i==n || j==n) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		System.out.println("-----------Swastik-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i==n||j==n || 
						(i==1&&j<=n) || 
						(j==1 && i>=n) || 
						(j==n*2-1 && i<=n) || 
						(i==n*2-1 &&  j>=n) )  {
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
