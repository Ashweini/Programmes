package String;

import java.util.Arrays;

public class StringtoInteger {

	public static void main(String[] args) {
		String s = "apple";
		int[] a=new int[s.length()];
		for(int i=0; i<s.length();i++) {
			int ch = s.charAt(i);	
			a[i]=ch;
			System.out.print(ch);
		}
		//System.out.print(ch);
		System.out.println(Arrays.toString(a));
		
//-------------------------------------------------------------------------
		//prime character or not
		for(int i=0; i<a.length;i++) {
			int n=a[i], count =0;
				for(int j=1; j<=n; j++) {
					if(n%j==0) {
						count++;
					}
				}
				//System.out.println(count);
				if(count==2) {
					System.out.println((char)n+" is a Prime Number");
				}
		}
	}

	}


