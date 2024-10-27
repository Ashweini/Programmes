package step_2Pattern;

public class PatternStep2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------Primary diagonal-------------");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==j) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------secodary diagonal-------------");
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j==(n+1)) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------z shape-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||i+j==n+1||i==n) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------N shape-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1||i==j||j==n) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------left arrow-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1||i==1||i==j) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------right arrow-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||j==n||i+j==n+1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------down arrow-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==n||j==n||i==j) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------x shape-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j||i+j==n+1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------Box shape-------------");
		//int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1||j==1||i==n||j==n||i==j||i+j==n+1) {
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
