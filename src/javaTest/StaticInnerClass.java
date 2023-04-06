package javaTest;

public class StaticInnerClass {
	class outerclass{
		static class innerclass{
			void display() {
				System.out.println("this is inner class method");
			}
			static void show() {
				System.out.println("this is static innerclass method");
			}
	}
	}

	public static void main(String[] args) {
		outerclass.innerclass.show();
		

		outerclass.innerclass obj=new outerclass.innerclass();
				obj.display();

	}

}

//output
//this is static innerclass method
//this is inner class method

