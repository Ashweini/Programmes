package String;

import java.util.Arrays;

public class StringAnagramOrnot {

	public static void main(String[] args) {
		String s1 = "care";
		String s2 = "race";
		if(s1.length()==s2.length()) {
		char[] a= s1.toCharArray();
		char[] b= s2.toCharArray();
//		System.out.println(a);
//		System.out.println(b);
		
		Arrays.sort(a);
		Arrays.sort(b);
//		System.out.println(a);
//		System.out.println(b);
		
		String s3 = new String(a);
		String s4 = new String(b);
		
		if(s3.equals(s4)) {
			System.out.println("String is anagram");
		}
		else {
			System.out.println("string is not a anagaram");
		}
		}
		else {
			System.out.println("length must be same");
		}
//---------------------without using inbuild method------------------------------------
//		String s1 = "care"; String s2 = "race";
//		char[] a=new char[s1.length()];
//		char[] b=new char[s2.length()];
//		for(int i=0; i<s1.length();i++) {
//			char ch = s1.charAt(i);
//			a[i]=ch;
//		}
//		Arrays.sort(a);
//		String s3="";
//		for(int i=0;i<a.length;i++) {
//			s3 = s3+a[i];
//		}
//		System.out.println(s3);
//		for(int i=0; i<s2.length();i++) {
//			char ch = s2.charAt(i);
//			b[i]=ch;
//		} 
//		Arrays.sort(b);
//		String s4="";
//		for(int i=0;i<b.length;i++) {
//			s4 = s4+b[i];
//		}
//		System.out.println(s4);
//		if(s3.equals(s4)) {
//			System.out.println("String is anagram");
//		}
	}

}
