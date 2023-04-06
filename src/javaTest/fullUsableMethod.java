package javaTest;

public class fullUsableMethod {

	public static void main(String[] args) {
		fullUsableMethod ns=new fullUsableMethod();
		//System.out.println(ns.sum(30, 70)); or
		//System.out.println(ns.sum(30, 70)+20);or
		//System.out.println("return "+ns.sum(20,30));or
		int result=ns.sum(40,90 )+40;
		System.out.println("result= "+result);

	}
int sum(int a,int b) {
	int c=a+b;
	return c;
}
}
//result= 170
