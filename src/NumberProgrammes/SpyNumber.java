//WAJP to check given number is spy Number or not

package NumberProgrammes;
public class SpyNumber {

	public static void main(String[] args) {


		int n = 123, sum =0, prd=1;
		while(n>0) {		
			int m =n%10;
			sum=sum+m;
			prd= prd*m;
			n=n/10;
		}
		System.out.println(sum+"->"+prd);
		//using conditional operator
		String res = sum==prd? "sypy number":"Not a spy number";
		System.out.println(res);
		/*if(sum==prd) {
			System.out.println("spy number");
	}
		else {
			System.out.println("not a spy number");
		}*/

}
}