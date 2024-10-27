package Basic;

public class SmithTshirt {

	public static void main(String[] args) {


		String color1 = "Green";
		//String color2 = "Red";
		
		//Boolean res = color1 == "Black" || color1 == "Red" ;
		
		//System.out.println(res);
		int i = 10;
		//System.out.println(!(10)); // Error- constant we can't perform relational operations
		System.out.println(!true); // false
		//System.out.println(!10==10); //false - bcz of presecendy ! has highest priority first it checks !10
		System.out.println(5<2); //false
		System.out.println(!false); //true
		System.out.println(10<=50? "hello":100);
		
		/*if(color1 == "black" || color2 == "Red")
		{
			System.out.println("Simth will buy Tshirt because he found "+color1 +" or "+color2);
		}
		else {
		
			System.out.println("Simth won't buy Tshirt because he sisn't find his desired color");
		}*/

	}

}
