package String;

public class ConvertToUpperwithoutusingInbuilt {

	public static void main(String[] args) {
		String s = "ashwini";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				int n=ch-32;
				System.out.print((char)n);
			}else {
				System.out.print(ch);
			}
		}

	}

}
