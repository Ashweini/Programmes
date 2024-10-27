package Patterns;

public class Step3_Patterns {

	public static void main(String[] args) {
		System.out.println("-----------left upper triangle-------------");
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i>=j) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------right upper triangle-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j>=n+1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------left down triangle-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j<=n+1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}


		System.out.println("-----------right down triangle-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i<=j) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-------------------Mirror type Programs ");
		System.out.println("-----------Combined left and right upper triangle-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if(i>=j || i+j>=2*n) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------Combined left and right down triangle-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if((i+j<=n+1|| j-i>=n-1)) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("-----------left down and right upper triangle-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=n; j++) {
				if((i+j<=n+1) || (i-j>=n-1)) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("-----------right upper and right upper triangle-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=n; j++) {
				if(i<=j || i+j>=2*n) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("-----------right upper and right upper and left down and left upper triangle-------------");
		//int n=5;
		for(int i=1; i<=2*n-1; i++) {
			for(int j=1; j<=2*n-1; j++) {
				if((i+j<=n+1)||(j-i>=n-1)||(i-j>=n-1)||(i+j>=3*n-1)) {
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
