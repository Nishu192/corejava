package Constructor;

public class InstConst {
	String StudentName;
	int RollNumb;
	
	InstConst(String name , int roll){
		StudentName=name;
		RollNumb=roll;
	}
	void printData() {
		System.out.println("Name="+ StudentName+" rollnumber="+RollNumb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstConst ic=new InstConst("nishu",100);
		ic.printData();
		InstConst singh =new InstConst("singh",200);
		singh.printData();
		
		// or System.out.println("Name="+ ic.Studentname+" rollnumber="+ic.Rollnumb);
	}

}
