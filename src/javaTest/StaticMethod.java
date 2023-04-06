package javaTest;

public class StaticMethod {
 static void show() {
	 System.out.println("this is show method");
	 
 }
 public static void main(String[] args) {
		show();
		// or StaticMethod.show();
	}
}

//output:this is show method