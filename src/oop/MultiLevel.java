package oop;

public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
D a=new D();
a.PrintData();
System.out.println("a="+a.a);
System.out.println("======================================");

E obj=new E();
obj.PrintData();
obj.SetData();
System.out.println("a="+obj.a);
System.out.println("a="+obj.b);
System.out.println("======================================");

F objc=new F();
objc.dsplay();
obj.PrintData();
obj.SetData();
System.out.println("a="+objc.a);
System.out.println("a="+objc.b);
System.out.println("a="+objc.c);
System.out.println("======================================");






	}

}
class D {
	int a=30;
	void PrintData() {
		System.out.println("this a="+a);
	}
}
class E extends D{
	int b=35;
	void SetData() {
		System.out.println("this b="+b);
	}
}
class F extends E{
	int c=55;
	void dsplay() {
		System.out.println("this c="+c);
	}
}