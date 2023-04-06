package stringMethods;

public class IsEmptyInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love java and selenium";
		String s1="";
		String s2=" ";
		System.out.println(s.isEmpty());//false
		System.out.println(s1.isEmpty());//true
		System.out.println(s1.isBlank());//true
		System.out.println(s2.isEmpty());//true
		System.out.println(s2.isBlank());//true
	}

}
