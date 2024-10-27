package NumberProgrammes;

public class XyleomPLoemProgramme {

	public static void main(String[] args) {
		
		int n = 158219, Isum=0, Osum=0;
		int Last = n%10;n=n/10;
		
		while(n>=10) {	
				int rem = n%10;
				Isum= Isum+rem;	
			    n=n/10;
		}
		Osum = Last+n; 
		if(Osum==Isum) {
			System.out.println("xylom");
		}
		else {
			System.out.println("phloem");
		}

	}

}
