package NumberProgrammes;

public class _03_08_PErfectSqaueorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int n=8;
		for(int i=1; i<=n/2; i++) {
			if(i*i==n) {
				flag=true; //confirmation comtainer 
				break;
			}
		}
		if(flag==true)
			System.out.println("Perfect Number : "+n);
		else
			System.out.println("Not a perfect Number");
	
	}
}
