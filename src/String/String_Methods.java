package String;

import java.util.Arrays;

public class String_Methods {

	public static void main(String[] args) {


		String s1 = "java";
		String s2 = new String("java");
//		String s3 = "java";
//		String s4 = new String("java");
		System.out.println(s1==s2);//false 0x1==0x2
		
		System.out.println("-------equals-------");
		System.out.println(s1.equals(s2)); //true
		
		System.out.println("----------length----");
		System.out.println(s1.length());   //4
		
		System.out.println("-------charAt-----");
		System.out.println(s1.charAt(2));  //2
		
		System.out.println("-----extract each char------");
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println("-----toUpper--------");
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		System.out.println("---------toLowerCase------");
		String name = "ASHWINI RAMMAPPA";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());

		System.out.println("------------trim-----------");
		String s = "     Good    Morning    ";
		System.out.println(s.trim());
		
		System.out.println("-----------------");
		System.out.println(s.isEmpty());  //false
		String y = "                                     ";
		//System.out.println(y.isBlank()); //- I am not getting this result it should be //true
		System.out.println(y.isEmpty());//false space is character 
		
		System.out.println("-------------substring(int begin index)--------");
		String s6 = "java is a pgrm lang";
		System.out.println(s6.substring(10));//pgrm lang
		//System.out.println(s6.substring(10, 14));
		
		System.out.println("-------------substring(int beginindex, int endindex)--------");
		String s7 = "java is a pgrm lang";
		System.out.println(s7.substring(10, 14));
	
	
		System.out.println("-----indexOf(char ch)------------");
		String ind = "pro gramming";
		System.out.println(ind.indexOf(' '));
		
		System.out.println("-----LastindexOf(char ch)------------");
		String ind1 = "programming";
		System.out.println(ind.lastIndexOf('g'));
		
		System.out.println("---------toCharArray()-----------");
		String c="hello";
		char[] a=c.toCharArray();
		System.out.println(Arrays.toString(a));
		
		System.out.println("------split()----------");
		String d="java is a programming laguage";
		//System.out.println(d.split(d));
		String[] d1 = d.split(" ");
		System.out.println(Arrays.toString(d1));
	
	}

}
