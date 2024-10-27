package String;

public class StringContainsOnlyDigitOrnot {

	public static void main(String[] args) {
		String s = "1223";
		s = s.toLowerCase();
		boolean flag = true;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9') { 
				//do nothing
			}
			else {
				flag = false;
				break;
			}
		}
		if(flag==true)
			System.out.println("String only contains Digits");
		else
			System.out.println("String not only contains Digits");


	}

}
