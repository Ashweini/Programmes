package NestedForLoop;

public class Print1234SinglwRow {

	public static void main(String[] args) {

System.out.println("-------------for loop--------------");
		//for loop
		for(int i=1; i<5;i++) {
			System.out.print(i+" ");
		}
		
System.out.println();		
System.out.println("-------------while loop-------------");
		//while loop
		int i=1;
		while(i<5) {
			System.out.print(i+" ");
			i++;
		}
		
System.out.println();
System.out.println("--------------do while loop------------");
		//do while loop
		int j=1;
		do {
			System.out.print(j+" ");
			j++;
		}while(j<5);

}
}