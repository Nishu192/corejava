package javaTest;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		int numb= 6;
System.out.println("Factorial of Number:");
for ( int i=0; i<=(numb -1);i++) {
// logic (n-0)(n-1)(n-2)(n-3)....
	fact=fact*(numb-i);
	//1*5=5 *, 5*4=20, 20*3=60,60*2=120, 120*1=120	
}
System.out.println(fact);
	}
	

}
