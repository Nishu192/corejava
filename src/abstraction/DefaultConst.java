package abstraction;

public class DefaultConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();
	}

}
abstract class D{
	//D(){ or
	D(int a){
		System.out.println("this is constructor");
		System.out.println("a="+a);
	}
}
class C extends D{
	C(){
	super(34);
	}
}