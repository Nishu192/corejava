package finalJava;

public class FinalMethodInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		login1 obj=new login1();
		obj.display();
		obj.show();
		System.out.println("================");
		newLogin1 ob=new newLogin1();
		//ob.display();
		ob.show();	
	}
}
class login1{
final	void display() {
		System.out.println("login class display method");
	}
	void show() {
		System.out.println("login class show method");
	}
}
class newLogin1 extends login{
	//void display() { CANT override DUE TO FINAL
	//System.out.println("login class display method");
	//}
	void show() {
		System.out.println("newlogin class show method");
		display();
		System.out.println("display");
}
}
