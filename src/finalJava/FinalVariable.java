package finalJava;

public class FinalVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable fv=new FinalVariable();
		int result=fv.a;
		//fv.a=40; gives error
		fv.b=38;
		System.out.println(fv.b);
		System.out.println(fv.a);
	}
final int a=50;
int b=30;
}
