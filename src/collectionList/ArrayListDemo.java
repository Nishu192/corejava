package collectionList;

import java.util.ArrayList;

import com.sun.net.httpserver.Filter;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> a1= new ArrayList<>();
a1.add(10);
a1.add('c');
a1.add("Nishu");
System.out.println(a1);


ArrayList<Object> a12=new ArrayList<>();
a12.add(null);
a12.add(20.30f);
a12.add(10);
System.out.println(a12);
System.out.println(a12.remove(Integer.valueOf( 10)));
a1.addAll(a12);
System.out.println(a1);
System.out.println(a1.contains("nishu"));
System.out.println(a1.contains("Nishu"));
System.out.println(a1.containsAll(a1));
System.out.println(a1.get(3));
System.out.println(a1.get(0));
System.out.println(a1.indexOf('c'));
a1.remove(1);
System.out.println(a1);
a1.removeAll(a12);
System.out.println(a1);
//System.out.println(a12.remove(Integer.valueOf((int) 20.30f)));

a1.clear();
System.out.println(a1);
	}

}
