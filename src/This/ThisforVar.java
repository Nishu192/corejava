package This;

public class ThisforVar {
	int a;
	int b;
	void setData(int a,int b) {
		this.a=a;// this because of same name of local and instance variable
		this.b=b;
		
	}
	void getData() {
		System.out.println("a="+a+" b="+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisforVar t=new ThisforVar();
		t.setData(20, 30);
		t.getData();
	}

}
