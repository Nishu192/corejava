package exception;

import java.io.File;
import java.io.FileInputStream;

public class FinallyInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start program");
		int a=10; 
		System.out.println("before exception");
		int b;
		try {               	
		 b=a/0; 
		 //b=a/1;
	
		}
		catch(Exception e) {         
			System.out.println("got exception");
			e.printStackTrace();// (to print exception stack trace)print whole stack trace with the exception in console
			b=a/1;// program run normally
			System.out.println(e.getMessage());
		}
		finally { //clean up related code
			System.out.println("this is finally block");
			// finaally execute forcefully explicity code and execute in both cases if exception is occur or not
		}
		System.out.println("after exception");
		//System.out.println("a="+a);
		System.out.println("end program");
	}

}
