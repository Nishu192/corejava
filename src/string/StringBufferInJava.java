package string;

public class StringBufferInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="nishu";
	String	s2=s1.concat(" singh");
		System.out.println(s1);
		System.out.println("s2="+s2);
		
		
		
StringBuffer sb=new StringBuffer("this is string buffer");
System.out.println(sb);

sb.append("in Java");
System.out.println("sb="+sb);

StringBuilder sbu=new StringBuilder("this is stringbuilder");
sbu.append("in java");
System.out.println("sbu="+sbu);
	}

}
