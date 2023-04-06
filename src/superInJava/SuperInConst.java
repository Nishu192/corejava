package superInJava;

public class SuperInConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//B3 b=new B3();//default const
//A3 a= new A3();// default const
		B3 a=new B3();
		 B3 b= new B3(10);
		B3 c=new B3(10,20);
		B3 d=new B3(10,20,30);
	}

	
}
class A3{
	A3(){
		System.out.println("parent class zero arg constructor");//default const
	}
	A3 (int a ){
		System.out.println("parent class one arg constructor");
	}
	A3 (int a,int b ){
		System.out.println("parent class two arg constructor");
	}
}
class B3 extends A3{
	B3(){  //for default parent
	super();
	System.out.println("child class zero arg const");
	}
	B3(int a,int b){
	super (a,b);
	
	System.out.println("child class two arg const");
	
	}
	B3(int a){
		super (a);
		System.out.println("child class one arg const");
	}
	B3(int a,int b,int c){
	// by default compiler takes default super();
		
		System.out.println("child class three arg const");
		
		}
}