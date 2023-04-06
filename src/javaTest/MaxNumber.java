package javaTest;

public class MaxNumber {

	public static void main(String[] args) {
		int a[]= {0,10,30,40,20,90,60,70};
	int maxNumber=a[0];
		for(int i=0;i<a.length;i++) {
			if(maxNumber<a[i]) {
				maxNumber=a[i];
			}
			
		}
		System.out.println("maximum number is " +maxNumber);
	}
	
}
