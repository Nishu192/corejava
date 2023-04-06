package string;

public class StringBuilderInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sbu=new StringBuilder("this is stringbuilder");
System.out.println("sbu="+sbu);//sbu=this is stringbuilder
StringBuilder sbu1=new StringBuilder("in java");
System.out.println("sbu1="+sbu1);
sbu.append(" sbu in java");
System.out.println(sbu);
sbu.append(sbu1);
System.out.println(sbu);
	}

}
