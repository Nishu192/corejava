package oop;

public class HerarInh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
x xa=new x();
xa.SetData();
System.out.println("x="+xa.x1);
System.out.println("=======================================");

y ya=new y();
ya.SetData();
System.out.println("x="+ya.x1);
ya.GetData();
System.out.println("y="+ya.y1);
System.out.println("=======================================");

z za=new z();
za.SetData();
System.out.println("x="+za.x1);
za.display();
System.out.println("x="+za.z1);
System.out.println("=======================================");


	}

}
class x {
	int x1=60;
			void SetData() {
				System.out.println("this is parent class");
			}
}
class y extends x {
	int y1=48;
	void GetData() {
		System.out.println("This is child y");
	}
}
class z extends x{
	int z1=90;
	void display() {
		System.out.println("this is child z");
	}
}