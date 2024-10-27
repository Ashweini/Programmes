package Basic;

public class Test1 {
	
	static float f;

	public static void main(String[] args) {

		/*int x = 5;
		System.out.println(x++ + ++x);
		System.out.println(f);*/

		/*int x = 5;
		double y = 2.0;
		System.out.println(x / y);
		
		Test1 t=new Test1();
		System.out.println(t);
		calculate();
		//testMethod();
		
		System.out.println(true && false );
		System.out.println(true || false );
	

		boolean a = true;
		boolean b = false;
		System.out.println(a && b || a || !b);

		System.out.println(!(true && false) );
		System.out.println((true || false) && (true && false) );
		System.out.println(false && true || false );*/
		
		boolean p = true;
		boolean q = false;
		System.out.println( p || q && !p);
		
		boolean x = false;
		boolean y = true;
		System.out.println(!(x && y));
		
		boolean a = true;
		boolean b = false;
		boolean c = false;
		System.out.println(a || (b && c));

		/*int i = 1;
		while (i <= 5) {
		    System.out.print(i + " ");
		    i++;
		}*/

		/*while (true) {
		    // loop body
		}*/

		//int i=0;
		/*while (i < 5) {
		    // loop body
		}*/
		
		//while (i > 0) {
		    // loop body
		//}
		
		int num = 10;
		while (num > 0) {
		    System.out.print(num + " ");
		    num -= 2;
		}
		
		/*int g = 5;
		while (g > 0) {
		    System.out.println("Hello");
		}*/

		/*int i = 0;
		while (i < 5) {
		    System.out.print(i + " ");
		    i--;
		}
		
		int r = 10;
		float y = 3.14;*/



		
		





		
	}
	
	public static void calculate() {
	    int m = 5;
	    {
	        int n = 10;
	        System.out.println(m + n);
	    }
	   // System.out.println(m + n);
	}
	
	/*public void testMethod() {
	    int d = 5;
	    {
	        int d = 10;
	        System.out.println(d);
	    }
	    System.out.println(d);
	}*/


}
