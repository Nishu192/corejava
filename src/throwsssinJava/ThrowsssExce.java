package throwsssinJava;

public class ThrowsssExce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThrowsssExce t=new ThrowsssExce();
		t.readData();
		t.m();
	}
	void readData() throws InterruptedException { //throws exception only for checked exception
		
		
		Thread.sleep(1000);//
	}
	void m() throws InterruptedException {
		readData();
	}
}
