package Pattern_step1;

public class InvertedOppLshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------inverted opposit L shape-------------");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				if(i==1 || j==4) {
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
