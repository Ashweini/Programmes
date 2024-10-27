package String;

import java.util.Arrays;

public class ConvertStringtoCharArrayWithoutUsingInbuiltMethod {

	public static void main(String[] args) {
		String s="Welcome";
		char[] a1=s.toCharArray();  //with using imbuilt method 
		System.out.println(Arrays.toString(a1));
		System.out.println("------------------------");
		char[] a=new char[s.length()];
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);	
			a[i]=ch;
		}
		System.out.println(Arrays.toString(a));
	}

}
