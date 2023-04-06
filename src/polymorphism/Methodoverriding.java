package polymorphism;

public class Methodoverriding {

	public static void main(String[] args) 
	{
	A a=new A();
	a.add(10,20 );
	B b=new B();
	b.add(30, 20);
	}
	}
class A{
	void add(int a,int b) {
		System.out.println("class A add="+(a+b));
	}
}
class B extends  A{
	void add (int a, int b) {
		System.out.println("class B add="+(a+b));
	}

}


