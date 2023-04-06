package javaTest;

public class AssignMethods {

	public static void main(String[] args) {
		
		AssignMethods obj=new AssignMethods();
		short result=obj.sum(40,90);
 System.out.println("result="+result);//result=130
 
 AssignMethods objd=new AssignMethods();
	double resultd=objd.sumd(60.97d,90.80d);
System.out.println("result="+resultd);//result=result=151.76999999999998

AssignMethods objf=new AssignMethods();
float resultf=objf.sumf(50.97f,70.80f);
System.out.println("result="+resultf);//result=121.770004

AssignMethods objv=new AssignMethods();
int resultv=objv.sum(40,60);
System.out.println("result="+resultv);//result=100

	}
	
short sum(int a,int b) {
	short c=(short) (a+b);
	return c;
}
double sumd(double a,double b) {
	double c= a+b;
	return c;
}
float sumf(float a,float b) {
	float c= (a+b);
	return c;
}
void sumv(int a,int b) {

	int c=a+b;
}
}
