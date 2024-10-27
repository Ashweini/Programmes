package String;

public class RemoveSpaceAndPrint {

	public static void main(String[] args) {
		String s=" g o o d 1 ";
		s=s.toLowerCase();
				for(int i=0; i<s.length();i++) {
					char ch = s.charAt(i);
					if(ch!=' ') {
						System.out.print(ch);
					}
				}

	}

}
