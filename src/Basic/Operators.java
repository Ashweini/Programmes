package Basic;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1+'a'+"hello"+20+3+'A');
		
		System.out.println(10+20+"hello"+'a'); 
		
		System.out.println("hello"+'a'+10+20);
		
		System.out.println(5-2+10);
		
		/*int x=5;
		int y = x++ + ++x - x++ + ++x+ ++x;
		System.out.println(x);
		System.out.println(y);
		
		int a = 5, b = 2;
		int c = a / b;
		System.out.println(c);
		
		int z = 10;
		long w = 5000000000l;*/
		
		/*int x=1;
		int y = x++ + ++x - ++x + ++x+ ++x*x++;
		System.out.println(x);
		System.out.println(y);*/
		
		/*int x=11;
		int y = x++ + --x * x-- + ++x - --x + x++ + x--;
		System.out.println(x);
		System.out.println(y);*/
		
		int x=-11;
		int y = x++ + (--x - ++x)+ --x +x++ *x--;
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		

		
		}

}
