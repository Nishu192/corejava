package This;

public class thisformeth {

	
		int a;
		int b;
		void setData (int c, int d) {
			a=c;
			b=d;
		this.getData();	//or
		getData();
		}
		
		void getData() {
		System.out.println("a="+a+" b="+b);	
		}
		public static void main(String[] args) {
			thisformeth t=new thisformeth();
			t.setData(30, 40);
	}


}