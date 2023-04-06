package stringMethods;

public class SplitInJava {
	public static void main(String[] args) {
	
	String s="i love java and selenium ";
	String s1="i love /java and /selenium ";
	String arrOfString[]=s.split(" ");
	for(int i=0;i<arrOfString.length;i++) {
	System.out.println(arrOfString[i]);}
	
	String arrOfString1[]=s.split(" /");
	for(int i=0;i<arrOfString1.length;i++) {
		System.out.println(arrOfString1[i]);}
}
}
