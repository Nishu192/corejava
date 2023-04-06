package javaTest;

public class BankDemo {

	public static void main(String[] args) {
	String b="bank";
//String b="hdfc";or String b="union";
	String h="hdfc";
	String c="chase";
	String u="union";
	String s="state";
		
		if(b==h) {
			System.out.println("Welcome to HDFC Bank");
		}
		else if(b==c) {
	
		System.out.println("Welcome to chase Bank");
		}
		else if (b==u) {
			System.out.println("Welcome to Union Bank");
		}
		else {
			System.out.println("Welcome to State Bank");

}
	}
}
