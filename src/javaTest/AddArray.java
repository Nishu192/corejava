package javaTest;

public class AddArray {
	
	// static int c;// static variable
	
	public static void main(String[] args) {
		int b[]=new int[1];//local variable
		int a[]= {20,30,40,10,50};
		for(int i=0;i<a.length; i++) {
			b[0]= b[0]+a[i];
			//c= a[i];
		}
System.out.println("addition of all numbers in array is " +b[0]);
//System.out.println(c);
	}

}
