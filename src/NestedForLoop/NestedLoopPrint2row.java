package NestedForLoop;

public class NestedLoopPrint2row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("------------------for loop--------------------");
		for(int i=1; i<3;i++) {
			for(int j=1; j<5;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
		
		
System.out.println("------------------while loop--------------------");
		//while loop
		int k=1;
		while(k<3) {
			    int l=1;
				while(l<5) {
					System.out.print(l+" ");
					l++;
			}
				System.out.println();
			k++;
		}
		
		
System.out.println("-------------------do while loop-----------------");		
		//do while 
		int n=1;
		
		do {	
			int m=1;
			do{
		     System.out.print(m+" ");
		     m++;
		    }while(m<5);
			System.out.println();
			n++;
		}while(n<3);
	
		
	}

}
