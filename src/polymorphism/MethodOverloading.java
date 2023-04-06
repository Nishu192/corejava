package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		double result=obj.add(10.8920d, 10);
		System.out.println("result double="+result);
		int result1 =obj.add(10, 20);
		System.out.println("result int="+result1);
	}
int add (int a,int b) {
	return a+b;
	
}int add(int a,int b,int c){
	return a+b+c;
}
int add(int a,int b,int c,int d) {
	return a+b+c+d;
	
}
float add (int a,float b) {
	return  a+b;
	
}
double add (double a,int b) {
	return a+b;
	
}
}
