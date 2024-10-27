package Practice;

public class Conditional4Operands {
	
	public static void main(String[] args) {
		int a =1, b=14, c=3, d=10;
		
		//int res = (a>b)?(a>c)?a:c:(b>c)?b:c;
		//(a>b)&&(a>c)?a:(b>c)?b:c;
		
		//int res = (a>b)?(a>c)?(a>d)?a:d:(b>c)?(b>d)?b:d:(c>d)?c:d;
		int res = (a>b)&&(a>c)&&(a>d)?a:(b>c)&&(b>d)?b:(c>d)?c:d;
		
		System.out.println(res);
		
	}

}
