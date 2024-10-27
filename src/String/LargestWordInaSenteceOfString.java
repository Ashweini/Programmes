package String;

import java.util.Arrays;

public class LargestWordInaSenteceOfString {
	public static void main(String[] args) {
		String d="e sala cup namde";
		String[] d1 = d.split(" ");
		System.out.println(Arrays.toString(d1));
		
		String max = d1[0];
		for(int i=0; i<d1.length;i++) {
			if(max.length()<d1[i].length()) {
				max=d1[i];
			}
		}
		System.out.println("Max word is : "+max);
	}

}
