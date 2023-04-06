package exception;

public class DemoTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start exception");
int a=10; 
System.out.println("before exception");
int b;
try {               
	//risky code that is responsible for abnormal  termination of the programme
 b=a/0;  //try throw this exception to the catch block
 // arithmetic exception
}
catch(Exception e) {           // catch block catch the exception from try block and execute the handling code
	 
	System.out.println("got exception");
	b=a/1;// handling code;
}
System.out.println("after exception");
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("end program");

	}

}
