package javaTest;

public class SwitchCaseDemo {

	public static void main(String[] args) {
int option =2;
int a=20;
int b=10;

switch(option) {
case 1:
	System.out.println((a+b));
	break;
case 2:
	System.out.println("Sub " +(a-b));
	break;
case 3:
	System.out.println("Mul " +(a*b));
	break;
case 4:
	System.out.println("Div " +(a/b));
	break;
}
	}

}
