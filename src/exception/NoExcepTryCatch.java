package exception;

public class NoExcepTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start exception");
		int a=10; 
		System.out.println("before exception");
		int b;
		try {               
			
		 b=a/1;  // no exception so catch block will not execute
		}
		catch(Exception e) {           
			System.out.println("got exception");
			b=a/1;// handling code;
		}
		System.out.println("after exception");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("end program");

			}

	}


