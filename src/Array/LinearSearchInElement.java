package Array;

public class LinearSearchInElement {

	public static void main(String[] args) {


		int[] a= {10, 5, 50, 45, 90, 70, 80};
		int ele=80; boolean flag = false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==ele) {
				flag =true;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
		
		
		

	}

}
