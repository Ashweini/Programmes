package Practice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		//print only evn element 
//		int[] a = {10, 2,4 ,5, 55, 24 ,57,98}; 
//		int sum=0, c=0;
//		for(int i=0; i<n.length; i++) {
//			if(n[i]%2==0) {
//				sum=sum+n[i];
//				c++;
//				System.out.println(n[i]);
//			}
//		}
//		System.out.println(sum);
//		System.out.println(sum+" "+" "+c+" "+sum/c);
	
		//prime Number
//		for(int i=0; i<a.length;i++) {
//			int c=0;
//			int n=a[i];
//			for(int j=1; j<=n; j++) {
//				if(n%j==0) {
//					c++;
//				}
//			}
//			//System.out.println(c);
//			if(c==2) {
//				System.out.println("prime number : "+a[i]);
//			}
//		}
		
		//reverse a given array
//		for(int i=a.length-1; i>=0; i--) {
//			System.out.print(a[i]+", ");
//		}
		
//		System.out.println("first element :"+a[0]);
//		System.out.println("Last element :"+a[a.length-1]);
	
//		int[] b=new int[a.length];
//		int j=0;
//		for(int i=a.length-1; i>=0; i--) {
//			b[j]=a[i];
//			j++;
//		}
//System.out.println(Arrays.toString(b));
		
		//reverse each element in array
//int[] a= {574, 349, 576, 5967, 9686};

//for(int i=0; i<a.length; i++) {
//	int rev=0;
//	int n=a[i];
//	while(n>0) {
//		int rem = n%10;
//		rev=rev*10+rem;
//		n=n/10;
//	}
//	System.out.println(rev);
//}	

//int max=a[0];
//for(int i=0; i<a.length; i++) {
//	if(a[i]>max) {
//		max=a[i];
//	}
//}
//System.out.println(max);

//int[] a= {6, 12, 2, 13, 15};
//for(int i=0; i<a.length; i++) {
//	int n=a[i];
//	boolean flag=false;
//	System.out.print(n+"->");
//	for(int j=1; j<=n; j++) {
//		//check factor
//		if(n%j==0) {
//			//check even or not
//			if(j%2==0) {
//				System.out.print(j+" ");
//				flag=true;
//			}
//		}
//	}
//	if(flag==false) {
//		System.out.print("No even number");
//	}
//	System.out.println();
//}
		
//merge 2 array
//int[] a = {1, 2, 3, 4, 5};
//int[] b = {6, 7, 8, 9, 10};
//int[] c = new int[a.length+b.length];int j=0;
//
//for(int i=0; i<c.length; i++) {
//	if(i<a.length) {
//		c[i]=a[i];
//	}else {
//		c[i]=b[j];
//		j++;
//	}
//}
//System.out.println(Arrays.toString(c));
		
//Array element zigzag
//int[] a= {1, 3, 5, 7, 9}; int x=0;
//int[] b= {2, 4, 6, 8, 10}; int y=0;
//int[] c=new int[a.length+b.length];
//int i=0;
//while(i<c.length) {
//	
//	if(x<a.length) {
//		c[i]=a[x];
//		i++;x++;
//	}
//	if(y<b.length) {
//		c[i]=b[y];
//		i++;y++;
//	}
//}
//System.out.println(Arrays.toString(c));
		
//missing element in a range 
int[] a = {1, 2, 3, 6, 7, 8, 10};

System.out.println(Arrays.toString(a));
System.out.print("missing element : ");
int i=0;
int j=a[0];


while(i<a.length) {
	if(j==a[i]) {
		i++; j++;
	}else {
		System.out.print(j+" ");
		j++;
	}	
}


	
		
	}

}
