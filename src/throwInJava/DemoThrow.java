package throwInJava;

public class DemoThrow {
int balance=10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThrow b=new DemoThrow();
		b.withdraw(15000);
	
	
		
	}
void withdraw(int amount) {
	if(balance<amount) {
	//throw new ArithmeticException();	
		throw new LowAccountBalanceException();//exception object
		
	}
	else {
		balance=balance-amount;
	}
}

}
