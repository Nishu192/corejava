package superInJava;

public class SuperDemo {

	//super is used to refer immediate parent class instance variable
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B b = new B();
//b.print();
C c=new C();
c.printData();
//A a=new A();
//System.out.println("z="+a.z);



	}

}
class A {//parent,base and super class
	int a=30;
	int z=40;
}
class B extends A{// child , derived and subclass
	int a=10;
	void print() {
		System.out.println("a="+super.a);
	}
}
class C extends B{
	int a=20;
	void printData(){
	System.out.println("a="+super.a);	
	System.out.println("z="+ z);
	}
		// TODO Auto-generated method stub

	
}