package String;

public class ReversingString {

	public static void main(String[] args) {
		String s = "Ashwini R";
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			System.out.print(ch+" ");
		}
	

	}

}
