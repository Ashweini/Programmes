package String;

public class StringContainsOnlyLetterorNot {

	public static void main(String[] args) {
		String s = "hello";
		s = s.toLowerCase();
		boolean flag = true;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') { //|| ch>='A' && ch<='Z') {
				//do nothing
			}
			else {
				flag = false;
				break;
			}
		}
		if(flag==true)
			System.out.println("String only contains letter");
		else
			System.out.println("String not only contains letter");

	}

}
