package stringMethods;

public class StringEqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ScriptQA";
String s2=new String("ScriptQA");
String s3= "ScriptQA";

//System.out.println(s==s2);//false
System.out.println(s.equals(s2));//true;comparing content of s2 withs
System.out.println(s.equals(s3));
	}

}
