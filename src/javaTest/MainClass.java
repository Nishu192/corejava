package javaTest;

public class MainClass {
String studentName;
int rollNo;
	public static void main(String[] args) {
		MainClass obj1=new MainClass();
		obj1.setData("Nishu",100);
		obj1.printData();

	}
void setData (String studentName1,int rollNo1) {
	studentName=studentName1;
	rollNo=rollNo1;	
}
void printData() {
	System.out.println("Name="+studentName + " rollNo=" +rollNo);
}
}
