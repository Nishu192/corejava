package javaTest;

public class BankSwitchCond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int option =3;
		
		switch(option) {
		case 1:
			System.out.println("Welcome to HDFC bank");
			break;
		case 2:
			System.out.println("Welcome to Chase bank");
			break;
		case 3:
			System.out.println("Welcome to Union bank");
			break;
		case 4:
			System.out.println("Welcome to State bank");
			break;
		default: 
			System.out.println("Choose option from 1 to 4");
				
		}
	}

}
