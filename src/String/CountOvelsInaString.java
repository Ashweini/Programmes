package String;

public class CountOvelsInaString {

	public static void main(String[] args) {
		String s="Welcome";
		int V=0;
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='a'|ch=='e'||ch=='i'|ch=='o'||ch=='u'|ch=='A'||ch=='E'|ch=='I'||ch=='O'|ch=='U') {
				V++;
			}
			
		}
		System.out.println("Count of Vowels : "+V);

	}

}
