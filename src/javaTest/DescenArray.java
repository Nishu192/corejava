package javaTest;

public class DescenArray {

	public static void main(String[] args) {
		int a[]= {30,20,60,10,80,70,40};
		int temp=0;
			for (int i=0;i<a.length;i++) {
				
				for (int j=i+1;j<a.length;j++) {
					if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
									
			}

			}
			//	System.out.print(a[i]+" ");	
			}
			for(int i=0; i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
				
	}
}
		
//output=80 70 60 40 30 20 10 
	


