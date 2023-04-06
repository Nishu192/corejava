package javaTest;

public class AscendArray {
//static int temp;
	public static void main(String[] args) {
	int a[]= {30,20,60,10,80,70,40};
//int temp;
	for (int i=0;i<a.length;i++) {
		int temp=0;
		for (int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
							
	}

	}
		//System.out.print(" "+a[i]+"");	
	}
	for(int i=0; i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
		
	}
}
//output=10 20 30 40 60 70 80 
