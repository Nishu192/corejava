package throwInJava;

public class LowAccountBalanceException extends RuntimeException{
	
	//private static final long serialVersionUID = 1L;

	LowAccountBalanceException(){
		super("account balance is low");
	}
}