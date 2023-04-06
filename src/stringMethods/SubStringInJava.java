package stringMethods;

public class SubStringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love java and selenium";
		System.out.println(s.substring(3));//ove java and selenium
		System.out.println(s.substring(0, 06));//i love
		System.out.println(s.substring(7, s.length()-1));//java and seleniu
		System.out.println(s.substring(7));//java and selenium
		System.out.println(s.substring(7, 11));//java
		System.out.println(s.charAt(7));//j
		System.out.println(s.charAt(11));//space
	}

}
