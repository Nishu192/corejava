package stringMethods;

public class IndexOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love java and selenium ";
		System.out.println(s.indexOf("java"));//7
		System.out.println(s.indexOf("and"));//12
		System.out.println(s.indexOf("and",17));//-1
		
	}

}
