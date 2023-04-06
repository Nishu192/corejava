package abstraction;

public class AbsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B obj=new B();
obj.PrintData();
obj.setData(30);
	}
}

abstract class A{
	int a=20;
abstract	void setData(int a);
	void PrintData(){
		System.out.println("a="+a);
	}
}
class B extends A{
	void setData(int b) {
		 a=b;
		// super.a=a;
		System.out.println("a="+a);
	}
}