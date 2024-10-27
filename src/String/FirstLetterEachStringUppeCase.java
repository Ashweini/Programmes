package String;

public class FirstLetterEachStringUppeCase {

	public static void main(String[] args) {
		String d="my name is smith";
		String[] a = d.split(" ");
		
		for(int i=0; i<a.length;i++) {
			String str = a[i];
			//traverse in str container
			for(int j=0; j<str.length();j++) {
				char ch = str.charAt(j);
				if(j==0 && ch>='a' && ch<='z') {
					int n = ch-32;
					System.out.print((char)n);
				}
				else {
					System.out.print(ch);
				}
			}
			System.out.print(" ");
		}

		

	}

}
