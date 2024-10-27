package String;

public class ParagramOrnot {

	public static void main(String[] args) {
		String s1 = "aaabcdefghijklmnopqrstuvwxy94#$zzzzzz";
		char[] a= s1.toCharArray();
		System.out.println(a);
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j])
					a[j]=Character.MAX_VALUE;
				}
			}
		
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z') {
				c++;
			}
		}
		System.out.println("letter : "+c);
		if(c==26) {
			System.out.println("Given string is paragram");
		}
		else {
			System.out.println("Not a paragram");
		}

	}

}
