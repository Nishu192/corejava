package stringMethods;

public class EqualsIgnoreCaseInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love java and selenium ";
		String s1="I love Java And Selenium ";
		System.out.println(s.equals(s1));//False
		System.out.println(s.equalsIgnoreCase(s1));//true
	}

}
