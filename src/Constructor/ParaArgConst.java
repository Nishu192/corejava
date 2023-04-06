package Constructor;

public class ParaArgConst {

	ParaArgConst(int a){
		System.out.println("1 arg int");
		System.out.println(+a);
	}
ParaArgConst(float a, int b){
	System.out.println("2 arg float and int");
	System.out.println("a="+a+" b= "+b);
	}
ParaArgConst(int a, float b, int c){
	System.out.println("3 arg int float int");
}
ParaArgConst(int a ,int b){
	System.out.println("2 arg int int");	
}
	public static void main(String[] args) {
		ParaArgConst p=new ParaArgConst(10.50f,5);
		ParaArgConst p1=new ParaArgConst(10);
		ParaArgConst p2=new ParaArgConst(10,20);
		ParaArgConst p3=new ParaArgConst(10,23.50f,30);

	}

}
