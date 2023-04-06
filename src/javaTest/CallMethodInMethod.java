package javaTest;

public class CallMethodInMethod {

	
	public static void main(String[] args) {
		CallMethodInMethod cm=new CallMethodInMethod();
		//cm.m();
		cm.m1();

System.out.println("this is main method");
	}
	void m() {
		System.out.println("this is method");
		//m1();
	}
	void m1() {
		System.out.println("this is call method");
		m();
	}
}
// output: this is call method
//this is method
//this is main method
