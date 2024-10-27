package String;

import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {

		String s = "hello hi welcome bye";
		String[] a = s.split(" ");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length;i++) {
			String str = a[i], rev="";
		
			for(int j=str.length()-1; j>=0; j--) {
				char ch = str.charAt(j);
				rev = rev+ch;
			}
			a[i]=rev;
		}
		System.out.println(Arrays.toString(a));
	}

}
