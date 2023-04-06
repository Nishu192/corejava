package finalJava;

public class UnintializeFinalVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnintializeFinalVar obj=new UnintializeFinalVar();// constructor and instance block
		
	}
final int a;//blank final variable trough instance block or constructor
final int b;
{
	a=30;// initialised by instance block
	System.out.println(+a);
}
UnintializeFinalVar()//constructor
{
	b=40;
	System.out.println(+b);
}
}
