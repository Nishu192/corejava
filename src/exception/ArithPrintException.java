package exception;

public class ArithPrintException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start exception");
		int a=10; 
		System.out.println("before exception");
		int b;
		try {               
			
		 b=a/0;  
		}
		catch(Exception e) {      // here Exception is a class     
			System.out.println("got exception");
			e.printStackTrace();// (to print exception stack trace)print whole stack trace with the exception in console
			
			System.out.println(e.getMessage());// only print exception message
			b=a/1;// program run normally
		}
		System.out.println("after exception");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("end program");

			}

	}


