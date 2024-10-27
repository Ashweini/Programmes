package String;

public class TrimWithoutUsinginBuildMethod {

	public static void main(String[] args) {
		String s = "   hell   o    ";
		int st=0, en=s.length()-1;
		
		for(int i=0; i<s.length();i++) {
			if(s.charAt(st)==' ') {
				st++;
			}	
			if(s.charAt(en)==' ') {
				en--;
			}	
		}
		System.out.println(st+"=>"+en);
		for(int i=st; i<=en; i++) {
			System.out.print(s.charAt(i));
		}
	
	}

}
