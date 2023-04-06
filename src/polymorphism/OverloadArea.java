package polymorphism;

public class OverloadArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadArea obj=new OverloadArea();
		int results=obj.Area(2);
		System.out.println("area of square="+results +"square unit");
		int resultr=obj.Area(3, 9);
		System.out.println("area of rectangle="+resultr+"square unit");
		double resultc=obj.Area(3.50f);
		System.out.println("area of circle="+resultc+"square unit");
	}
 int Area (int a){

return a*a;
}
 int Area (int a, int b ){ 
	 
	 return a*b; 
 }
double Area(float r) {
	
	 return 3.14*r*r;
 }

}
//output:
//area of square=4square unit
//area of rectangle=27square unit
//area of circle=38.465square unit
