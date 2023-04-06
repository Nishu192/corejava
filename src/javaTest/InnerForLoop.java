package javaTest;

public class InnerForLoop {

	public static void main(String[] args) {
		//10= 1 2 3 4 5 
		//11= 1 2 3 4 5 
		//12= 1 2 3 4 5 
		//13= 1 2 3 4 5 
		//14= 1 2 3 4 5 
		//15== 1 2 3 4 5 
		System.out.println("Pattern:");
		for(int i=10;i<=15;i++) {
			System.out.print(i+"=");
			 for(int j=1;j<=5;j++) {
				 System.out.print(j+ " ");
		}
System.out.println();
	}

}
}
