package String;

import java.util.Arrays;

public class OccuranceOfEachUniqueElementInString {

	public static void main(String[] args) {
		String s = "programming";
		char[] a1=s.toCharArray();  //with using imbuilt method 
		System.out.println(Arrays.toString(a1));
		
		for(int i=0; i<a1.length;i++) {
			int c=1;
			for(int j=i+1; j<a1.length;j++) {
				if(a1[i]==a1[j]) {
					c++;
					//a1[j]=(char) Integer.MAX_VALUE;
					a1[j]= Character.MAX_VALUE;
				}
			}
			if(a1[i]!=Character.MAX_VALUE && c==1)
				System.out.println(a1[i]+"->"+c);
		}

	}

}
