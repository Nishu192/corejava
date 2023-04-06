package StringConstructor;

public class StringConstructorInjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String();//blank string
String s1=new String("nishu");//passing string
StringBuffer sb=new StringBuffer("StringBuffer");
String s3=new String(sb);//convert the sringbuffer into string
System.out.println(s3);
StringBuilder sbb=new StringBuilder("StringBuilder");
String s4= new String(sbb);
System.out.println(s4);
//char[] a=new char[];
	}

}
