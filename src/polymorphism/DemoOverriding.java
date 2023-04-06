package polymorphism;

public class DemoOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LoginForm sbi=new LoginForm();
sbi.login();
System.out.println("===================================================");
newlogin hdfc=new newlogin();
hdfc.login();

	}
	}
class LoginForm{
  void login() {
	 System.out.println("enter the username for SBI");
	 System.out.println("enter the password for SBI");
	 System.out.println("enter the button for SBI");
 }
}
class newlogin extends LoginForm{
 void login() {
	 System.out.println("enter the username for HDFC");
	 System.out.println("enter the password for HDFC");
	 System.out.println("enter the button for HDFC");
 System.out.println("mobile numberfor HDFC");
 }
}

//enter the username for SBI
//enter the password for SBI
//enter the button for SBI
//===================================================
//enter the username for HDFC
//enter the password for HDFC
//enter the button for HDFC
//mobile numberfor HDFC

