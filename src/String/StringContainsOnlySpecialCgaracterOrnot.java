package String;

public class StringContainsOnlySpecialCgaracterOrnot {

	public static void main(String[] args) {
		String s = "@#$%^&#*";
		s = s.toLowerCase();
		boolean flag = true;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9' || ch>='a' && ch<='z') { 
				flag = false;
				break;
			}
		}
		if(flag==true)
			System.out.println("String contains only Special Character");
		else
			System.out.println("String not only contains special character");


	}

}
