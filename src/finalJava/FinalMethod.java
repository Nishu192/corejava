package finalJava;

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
login obj=new login();
obj.display();
obj.show();
newLogin ob=new newLogin();
ob.display();
ob.show();
	}

}
class login{
final	void display() {
		System.out.println("login class display method");
	}
	void show() {
		System.out.println("login class show method");
	}
}
class newLogin extends login{
	//void display() { CANT override DUE TO FINAL
	//System.out.println("login class display method");
	//}
	void show() {
		System.out.println(" newloginclass show method");
	}
}
