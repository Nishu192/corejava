package string;

public class StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String n1="nishu";
String n2="nishu";
String n3= new String("nishu");
String n4= new String("nishu");
System.out.println(n1==n2);//true ,because pointing same object in SCP
System.out.println(n2==n3);//false,because pointing different object one in SCP and other one in Heap memory
System.out.println(n3==n4);//false
	}

}
