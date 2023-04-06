package javaTest;

public class InnerWhileLoop {

	public static void main(String[] args) {
		// Pattern using Inner while loop
//		1=0 1 2 3 4 5 
//				2=0 1 2 3 4 5 
//				3=0 1 2 3 4 5 
//				4=0 1 2 3 4 5 
//				5=0 1 2 3 4 5 
//				6=0 1 2 3 4 5 
//				7=0 1 2 3 4 5 
//				8=0 1 2 3 4 5 
//				9=0 1 2 3 4 5 
//				10=0 1 2 3 4 5 

		System.out.println("Pattern using Inner while loop");
		int i=0;
		while(i<=10) {
			
			int j=0;
			System.out.print(i+"=");
			
			while(j<=5) {
				System.out.print(j+" ");
				j++;
					
			}
			i++;
			System.out.println();
		}
	

	}

}
