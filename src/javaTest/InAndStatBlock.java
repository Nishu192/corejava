package javaTest;

public class InAndStatBlock {
	{
		System.out.println("this is instance block");
	}
	static{
		System.out.println("this is static block");
		
	}

	public static void main(String[] args) {
		System.out.println("start");
		InAndStatBlock bl=new InAndStatBlock();
		System.out.println("end");

	}

}
// output:
//this is static block
//start
//this is instance block
//end
