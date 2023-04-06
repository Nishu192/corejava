package javaTest;

public class StaticVariable {
	int a=10;
	static int b=20;
	void increment() {
		a=a+1;
		b=b+1;
		System.out.println("a="+a+" b="+b);
		
	}
	public static void main(String[] args) {
		StaticVariable s=new StaticVariable();
		s.increment();
		StaticVariable s1=new StaticVariable();
		s1.increment();
		StaticVariable s2=new StaticVariable();
		s2.increment();
		StaticVariable s3=new StaticVariable();
		s.increment();
	}
	
}
