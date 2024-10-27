package Practice;

public class _7_PerfectNum_SquareRootExist {

	public static void main(String[] args) {
		int n = 15;boolean flag=false;
		
		for(int i=1;i<=n/2; i++) {
			if(i*i==n) {
				flag=true;
				break;
			}
		}

		if(flag==true)
			System.out.println("Perfect square");
		else
			System.out.println("Not a perfect square");
	}
}
