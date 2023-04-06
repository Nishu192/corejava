package Constructor;

public class ParamConst {
	
	ParamConst(int a){
		System.out.println(" this is int value");
	}
ParamConst(float a){
	System.out.println(" this is float value");
	}
ParamConst(short a){
	System.out.println(" this is short value");
}
ParamConst(long a){
	System.out.println(" this is long value");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConst p=new ParamConst(10);
		ParamConst p1=new ParamConst(10.30f);
		ParamConst p2=new ParamConst((long)10);
		ParamConst p3=new ParamConst((short)10);
		
		
	}

}
