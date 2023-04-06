package javaTest;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
int i;
for (i=0;i<5;i++) {
	//System.out.print(" ");
	int k;
	for (k=i+1;k<=4;k++) {
		System.out.print(" ");		
	} 
	int j;
	for(j=0;j<=i;j++) {
		System.out.print("*");	
		
	}
	System.out.println(" ");
}
}
}