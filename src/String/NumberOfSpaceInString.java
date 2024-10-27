package String;

public class NumberOfSpaceInString {

	public static void main(String[] args) {

		String s=" go od  m ornin g  ";
		//System.out.println(s.length());
		int c=0;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch==' ') {
				c++;
			}
			
		}
		System.out.println("Count of space : "+c);

	}

}
