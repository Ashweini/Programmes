package String;

public class ConvertFirstChartoUpperCase {

	public static void main(String[] args) {
		String s="ashwini";
		
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(i==0 && ch>='a' && ch<='z') {
				int n=ch-32;
				System.out.print((char)n);
			}
			else {
				System.out.print(ch);
			}
	}

}
}