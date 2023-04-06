package javaTest;

public class InstanceMethod {


void display() {
	System.out.println("this is instance display method");
}
	
	public static void main(String[] args) {
	InstanceMethod sm=new InstanceMethod();
	sm.display();

}
}
//output:this is instance display method