package String;

public class StringContainesVowelsOrNot {

	public static void main(String[] args) {
		String str = "sky";
		boolean flag = false;
		//traverse in str container
		for(int j=0; j<str.length();j++) {
			char ch = str.charAt(j);
			if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;
				break;
			}
	}
		
		if(flag==true) {
			System.out.println("word is Vowel");
		}
		else {
			System.out.println("String is not a Vowel");
		}

}
}