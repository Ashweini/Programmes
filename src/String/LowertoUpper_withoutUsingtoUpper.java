package String;

public class LowertoUpper_withoutUsingtoUpper {

	public static void main(String[] args) {


		String a = "apple@123";
//		for(int i=0;i<a.length();i++) {
////			int n=a.charAt(i)-32;
////			char n1 = (char)n;
//			char ch = (char) (a.charAt(i)-32);	
//			//conversion must be applicatble for only letters
//			if(ch>='A')
//				System.out.print(ch);
//			else
//				System.out.print(ch);
//		}
//		
//		//System.out.println(a.toUpperCase());
//		for(int i=0;i<a.length();i++) {
//			char ch =a.charAt(i);
//			if(ch>='a' && ch<='z') {
//				int n=ch-32;
//				System.out.print((char)n);
//			}
//			else {
//				System.out.print(ch);
//			}
//		}
//conver given string to lower case without using toLowerCase method
		String s = "APPLE@123";
		for(int i=0;i<s.length();i++) {
			char ch =a.charAt(i);
			if(ch>='A' && ch<='Z') {
				int n=ch+32;
				System.out.print((char)n);
			}
			else {
				System.out.print(ch);
			}
		}
		
	}

}
