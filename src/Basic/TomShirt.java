package Basic;


//5)Tom wants buy a Tshirt,tom tshirt size is small and  tshirt price should less than or equal to 1000
//char ch='s'; int price =1000;


public class TomShirt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char size = 's';
		int price = 999;
		
		Boolean res = size == 's' && price <= 1000;
		System.out.println(res);
		
		/*if(size =='s' && price<=1000 )
		{
			System.out.println("Tom Short size "+size+ "and price less tham "+price);
		}
		
		else 
		{
			System.out.println("Tom Short size is not small and price <= 1000");
		}*/

	}

}
