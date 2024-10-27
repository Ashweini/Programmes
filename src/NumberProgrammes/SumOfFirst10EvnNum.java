//2)	WAJP To Find Sum Of First 10 Even Number?
package NumberProgrammes;

public class SumOfFirst10EvnNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int sum=0;
		for(int i=0; i<=10;i++) {
			if(i%2==0) {
			   sum= sum +i;	
			  
			}
		}
		 System.out.println(sum);
	}

}
