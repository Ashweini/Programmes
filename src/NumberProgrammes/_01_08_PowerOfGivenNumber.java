//WAJPT find power of a given number 
//power*base - 2*2*2*2 =2^4

package NumberProgrammes;
public class _01_08_PowerOfGivenNumber {

	public static void main(String[] args) {
		int base=2, ex=4;
		int power=1;
		for(int i=1; i<=ex;i++) {
			power = power*base;
		}
		System.out.println(base+" exponential of "+ex+" is "+power);

	}

}
