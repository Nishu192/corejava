package abstraction;

public class AbsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewUser obj=new NewUser();
obj.addUser("krishna", "singh", 567897655);
obj.addUser("nishu", "singh", 3745682, "cumming st");
obj.adduser("Devansh", "singh");
	}

}
abstract class User{
	abstract void addUser(String firstName,String lastName, int mobileNumber);
}
class NewUser extends User{
	void addUser(String firstName,String lastName, int mobileNumber) {
	System.out.println("user firstname="+firstName);
	System.out.println("user lastname="+lastName);
	System.out.println("user phone="+mobileNumber);
	}
		
	void addUser (String firstName,String lastName, int mobileNumber,String address) {
		System.out.println("user address="+address);
	}
	void adduser(String firstName,String lastName) {
		System.out.println("user firstname="+firstName);
		System.out.println("user lastname="+lastName);
	}
}