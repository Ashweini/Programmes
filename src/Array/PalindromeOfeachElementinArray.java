package Array;

public class PalindromeOfeachElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {121, 526, 783, 467, 282};
		for(int i=0; i<a.length;i++) {
			int rev=0, temp=a[i];
			while(a[i]>0) {
				int rem = a[i]%10;
				rev = rev*10+rem; //* with 10 to shift the places 
				a[i]=a[i]/10;
			}
			//System.out.println(temp+"->"+rev);
			if(temp==rev) {
				System.out.println(temp+" : Given Number is palindrome");
			}			
		}

	}

}
