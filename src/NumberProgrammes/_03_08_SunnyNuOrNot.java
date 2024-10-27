package NumberProgrammes;

public class _03_08_SunnyNuOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int n=15;
//		int n1=n+1;
//		for(int i=1; i<=n1/2; i++) {
//			if(i*i==n1) {
//				System.out.println("Sunny Number");
//			}
//		}
//		if(flag==true)
//			System.out.println("Perfect Number : "+n);
//		else
//			System.out.println("Not a perfect Number");
		
		
//=================================================================================================================
		
		int n=15;
		int n1=n+1; boolean flag=false;
		for(int i=1; i<=n1/2; i++) {
			if(i*i==n1) {
				flag=true; //confirmation comtainer 
				break;
			}
		}
		if(flag==true)
			System.out.println("Sunny Number : "+n);
		else
			System.out.println("Not a Sunny Number");

	}

}
