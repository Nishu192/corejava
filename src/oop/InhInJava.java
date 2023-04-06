package oop;


public class InhInJava {

	
	
	public static void main(String[] args) {

child  obj=new child();
obj.print();
	}
}
		// TODO Auto-generated method stub
		class parent {
			int a=30;
			int b=20;
			void print() {
				System.out.println("a="+a+" b= "+b);
			}
		}
			class child extends parent{
				void getData() {
					System.out.println("a="+a);
				}
			}
	

						
			

	

