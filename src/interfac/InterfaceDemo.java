package interfac;

public class InterfaceDemo {

	public static void main(String[] args) {
		newUser obj=new newUser();
		obj.addUser();
		obj.deleteUser();
		obj.editUser();

	}

}
interface user {
	//static final int a;
int a=10;
 void addUser();
void deleteUser();
void editUser();
}
class newUser implements user{
	 public void addUser() {
		 System.out.println(" this is add user method");
		
	}

	@Override
	public void deleteUser() {
		 System.out.println(" this is delete user method");
		
	}

	@Override
	public void editUser() {
		 System.out.println(" this is edit user method");
		
	}
}