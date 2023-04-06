package javaTest;

public class MinNumber {

	public static void main(String[] args) {
		
				int a[]= {25,80,30,40,20,90,60,70};
			int minNumber=a[0];
				for(int i=0;i<a.length;i++) {
					if(minNumber>a[i]) {
						minNumber=a[i];
					}
					
				}
				System.out.println("minimum number is " +minNumber);
			}
			
	}


