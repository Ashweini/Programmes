package NumberProgrammes;

public class _06_08_GCFbte2Number {

	public static void main(String[] args) {

		int n1=12, n2=20; 
		int GCD=0;
		for(int i=1;i<=n1 && i<=n2; i++) {
			if(n1%i==0 && n2%i==0) {
				GCD=i;
			}
		}
		System.out.print("GCD is : "+GCD+" ");
		}

	}

