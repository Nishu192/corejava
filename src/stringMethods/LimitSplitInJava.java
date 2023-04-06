package stringMethods;

public class LimitSplitInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="i love java and selenium ";
		String arrayOfString[]=s1.split(" ", 15);
		for(int i=0;i<arrayOfString.length;i++) {
			System.out.println(arrayOfString[i]);}
	}

}
