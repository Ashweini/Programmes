package Array;

public class WholeArrayPalindrome {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 3, 2, 1};
		int st=0, en=a.length-1; boolean flag=true;
		for(int i=0; i<a.length/2; i++) {
			if(a[st]==a[en]) {
				System.out.println(a[st]+"=="+a[en]);
				st++; en--;
			}
			else {
				System.out.println(a[st]+"=="+a[en]);
				flag=false; break;
			}
		}
		
		if(flag==true) {
			System.out.println("Palindrome array");
		}
		else {
			System.out.println("not a palindrome array");
		}
	}

}
