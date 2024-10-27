package Pattern_step1;

public class StarLshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		
		System.out.println("--------------L shape---------------");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==4 || j==1) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
