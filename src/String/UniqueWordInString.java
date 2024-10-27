package String;

import java.util.Arrays;

public class UniqueWordInString {

	public static void main(String[] args) {
		String d="hello hi bye hello bye welcome hello hi";
		//System.out.println(d.split(d));
		String[] d1 = d.split(" ");
		System.out.println(Arrays.toString(d1));
		
		for(int i=0; i<d1.length;i++) {
			int c=1;
			for(int j=i+1; j<d1.length;j++) {
				if(d1[i].equals(d1[j])) {
					c++;
					d1[j]= "";	
				}
			}
			if(d1[i]!="" && c==1)
				System.out.println(d1[i]+"->"+c);
		}
		

	}

}
