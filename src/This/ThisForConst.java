package This;

public class ThisForConst {

	
	ThisForConst (){
		this(10);
		System.out.println("this is 0 arg constructor");
		m();
	}
	ThisForConst (int a){
		this(20,30);
		System.out.println("this is 1 arg constructor");
	}
	ThisForConst (int a, int b){
		System.out.println("this is 2 arg constructor");
	}
	ThisForConst (int a, int b, int c){
		System.out.println("this is 3 arg constructor");
	}
	void m() {
		System.out.println("this is method");
	}
	public static void main(String[] args) {
		ThisForConst t=new ThisForConst();
		System.out.println("end main method");		
	}

}
