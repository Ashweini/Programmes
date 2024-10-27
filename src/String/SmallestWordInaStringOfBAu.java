package String;

import java.util.Arrays;

public class SmallestWordInaStringOfBAu {

	public static void main(String[] args) {
		String d="e sala cup namde";
		String[] d1 = d.split(" ");
		System.out.println(Arrays.toString(d1));
		
		String min = d1[0];
		for(int i=0; i<d1.length;i++) {
			if(min.length()>d1[i].length()) {
				min=d1[i];
			}
		}
		System.out.println("Max word is : "+min);
	}

	}
