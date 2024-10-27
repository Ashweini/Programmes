package String;

public class StringContainsDigitOrnot {

	public static void main(String[] args) {
		String s = "hel1o";
		boolean flag = false;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') {
				flag = true;
				break;
			}
		}
		if(flag==true)
			System.out.println("String contains digit");
		else
			System.out.println("Not containes digit");

	}

}
