package javaTest;

public class LocalVariable {

	public static void main(String[] args) {
		LocalVariable t=new LocalVariable();
		int d=t.display();
		System.out.println(d);	

	}

	int display() {
		int d=50;
		
		return d;
	}
}
