package exception;

import java.io.File;

import java.io.FileInputStream;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
File f= new File("C:\\Users\\enggn\\Downloads\\testFile.txt" );
try {
FileInputStream fs= new FileInputStream(f);
} 
catch(Exception e) {
System.out.println("backup file path");	
}
}
}

