package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class MultiCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start program");
		int a=10; 
		System.out.println("before exception");
		int b;
		try {               	
		 b=a/0;  
	File f= new File("c://data//data.txt " );
	FileInputStream fs=new FileInputStream(f);	
		}
		catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}
		
		catch(NullPointerException ne) {
			ne.printStackTrace();
			}
			catch(ArithmeticException ae) {
				System.out.println("Arithmetic Exception");
				ae.printStackTrace();
		}
catch (RuntimeException re) {
			re.printStackTrace();
		}
		catch(Exception e) {      // here Exception is a parent class     
			System.out.println("got exception");
			e.printStackTrace();// (to print exception stack trace)print whole stack trace with the exception in console
			
			System.out.println(e.getMessage());// only print exception message
			b=a/1;// program run normally
		}
//		catch (Throwable ob) {
//			ob.printStackTrace();
//		}
		System.out.println("after exception");
		System.out.println("a="+a);
		System.out.println("end program");

			}

	}


