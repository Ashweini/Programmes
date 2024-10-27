package String;

public class StringPlalindromeOrNot {

	public static void main(String[] args) {
		String s = "Ashwini";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			rev = rev +ch;
		}
		System.out.println(s+"->"+rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}

}
