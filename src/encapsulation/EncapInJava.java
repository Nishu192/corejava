package encapsulation;

public class EncapInJava {
private int a;//so no one access var out of this class
private int b;

void setData(int a,int b) {
	this.a=a;
	this.b=b;
}
void getData() {
	System.out.println("a="+a+"b="+b);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A();
//System.out.println(a.a); error
a.setData(10, 20);
a.getData();


	}

}
class A{
	private int a;//so no one access var out of this class
	private int b;

	void setData(int a,int b) {
	this.a=a;
	this.b=b;
	}
void getData() {
	System.out.println("a="+a+ " b="+b);
}

	
}
