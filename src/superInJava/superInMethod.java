package superInJava;

public class superInMethod {

	public static void main(String[] args) {
		B1 b= new B1();
		b.display();
		

	}

}
class A1{
	int a= 30;
	void Print() {
		System.out.println("parent class a="+a);
	}
}
class B1 extends A1{
int a=10;	
void Print() {
	System.out.println("child class a="+a);
}
void display() {
	Print();
	super.Print();
}
}
