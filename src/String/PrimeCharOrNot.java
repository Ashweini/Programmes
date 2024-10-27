package String;

public class PrimeCharOrNot {

	public static void main(String[] args) {
		String s = "apple";
		System.out.println("Prime number");
		for(int i=0; i<s.length();i++) {
				char ch = s.charAt(i);
				int n=ch;
				//check n is prime or not
                int count =0;
				for(int j=1; j<=n; j++) {
					if(n%j==0) {
						count++;
					}
				}
				//System.out.println(count);
				if(count==2) {
					System.out.print(ch+" ");
				}
		}


	}

}
