package stringMethods;//casesensitive

public class ContainsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love java and selenium";
		System.out.println(s.contains("and"));//true
		System.out.println(s.contains("And"));//false
		System.out.println(s.contains("QA"));//false
		
	}

}
