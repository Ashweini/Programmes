package NumberProgrammes;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=12321, rev=0, temp=n;
		while(n>0) {
			int rem = n%10;
			rev = rev*10+rem; //* with 10 to shift the places 
			n=n/10;
		}
		System.out.println(temp+"->"+rev);
		if(temp==rev) {
			System.out.println("Given Number is palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
