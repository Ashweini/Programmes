package String;

public class CountLetterNumberSpecialChar {

	public static void main(String[] args) {
		String s="Tom5757@gmail.com";
		s=s.toLowerCase();
				int l=0, d=0,sp=0;
				for(int i=0; i<s.length();i++) {
					char ch = s.charAt(i);
					if(ch>='a' && ch<='z' ) {   
						l++;
					}
					else if(ch>='0'&& ch<='9') {
						d++;
					}
					else
						sp++;
				}
				System.out.println("Number of letters : "+l);
				System.out.println("Number of character : "+d);
				System.out.println("Number of SpecialCharacter : "+sp);

	}

}
