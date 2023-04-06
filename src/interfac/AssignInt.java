package interfac;

public class AssignInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
C obj=new C();
obj.editData();
obj.getData();
obj.setData();
	}

}
interface A{
void setData();
void getData();
}
interface B{
	void setData();
	void getData();
	void editData();
}
class C implements A,B{

	@Override
	public void editData() {
		System.out.println("this is editdata method");
	}

	@Override
	public void setData() {
		System.out.println("this is setdata method");
		
	}

	@Override
	public void getData() {
		System.out.println("this is getdata method");
		
	}
	
}
//output:
//this is editdata method
//this is getdata method
//this is setdata method
