package NumberProgrammes;

public class SpyNumberBtwRAnge {

	public static void main(String[] args) {
		for(int i=1; i<=1000;i++) {
		int n = i, sum =0, prd=1;
		while(n>0) {		
			int m =n%10;
			sum=sum+m;
			prd= prd*m;
			n=n/10;
		}
		if(sum==prd)
		System.out.println("sypy number "+i);
	}
	}

}
