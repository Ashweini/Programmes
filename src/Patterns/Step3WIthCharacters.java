package Patterns;

public class Step3WIthCharacters {

	public static void main(String[] args) {
		
		int n=5;
		System.out.println("-----------left upper triangle-------------");
		for(int i=1; i<=n; i++) {
			char ch = 'A';
			for(int j=1; j<=n; j++) {		
				if(i>=j) {
				System.out.print(ch+ " ");
				ch++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------right upper triangle-------------");
		for(int i=1; i<=n; i++) {
			char ch = 'E';
			for(int j=1; j<=n; j++) {	
				if(i+j>=n+1) {
				System.out.print(ch+" ");
				ch--;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------right upper triangle - number-------------");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				//char ch = 'A';
				if(i+j>=n+1) {
				System.out.print(j+ " ");
				
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------left upper triangle - number-------------");
		for(int i=1; i<=n; i++) {
			int n1=4;
			for(int j=1; j<=n; j++) {				
				if(i>=j) {
				System.out.print(n1+ " ");
				n1--;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		System.out.println("-----------right down triangle - number-------------");
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i>=j ) {
					if(i%2==0) 
						System.out.print("0 ");
					else 
					System.out.print("1 ");
			}
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("-----------left down triangle - number-------------");
		int n1=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {			
				if(i+j<=n+1) {
				System.out.print(n1+ " ");
				n1++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		
		System.out.println("-----------combine left down & downtriangle - character-------------");
		
		for(int i=1; i<=n*2-1; i++) {
			char ch='A';
			for(int j=1; j<=n; j++) {			
				if(i+j<=n+1 || i-j>=n-1) {
				System.out.print(ch+ " ");
				ch++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
		System.out.println("-----------combine left rigt Upper triangle - Number-------------");
		
		for(int i=1; i<=n; i++) {	
			for(int j=1; j<=n*2-1; j++) {			
				if(i+j>=n+1 && j-i<=n-1) {
				System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
System.out.println("-----------combine left rigt down triangle - Number-------------");
		
		for(int i=1; i<=n*2-1; i++) {	
			for(int j=1; j<=n; j++) {			
				if(i<=j || i+j>=n*2) {
				System.out.print(i+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	




	}

}
