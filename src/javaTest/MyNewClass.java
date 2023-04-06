package javaTest;

public class MyNewClass {
	static String studentName;
	static int rollNo;
	void setData (String Aba,int r12){
		studentName="Aba";
		rollNo=12;
	}
	void printData() {
		
	}

	public static void main(String[] args) {
	
System.out.println("Name="+studentName + " rollNo=" +rollNo);
	}

}
//output :Name=null rollNo=0