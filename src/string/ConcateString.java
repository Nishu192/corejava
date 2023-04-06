package string;

public class ConcateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s1="nishu";
 String s2="Singh";
 String s3="Manish";
 System.out.println(s1+s2+s3);//nishuSinghManish
 System.out.println(s1+" "+s2+" "+s3);//nishu Singh Manish
String s5= s1.concat(s3);
 System.out.println(s1);//nishu
String  s4=s1.concat(" abc");
System.out.println(s4);//nishu abc
System.out.println(s5);//nishuManish
 
	}

}
