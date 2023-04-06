package oop;

public class SingleInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A st =new A();
st.printData();
System.out.println("a="+st.a);
B obj=new B();
obj.printData();
obj.ShowData();
System.out.println(obj.b);



	}
	}
class A{
	int a=20;
	void printData() {
		System.out.println("Parent class print method a= "+a);
	}
}
class B extends A{
	int b=30;
	void ShowData() {
		System.out.println("child class showdata method b="+b);
	}
}

