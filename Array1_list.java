package Array;

import java.util.ArrayList;
import java.util.Iterator;

public class Array1_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> obj=new ArrayList<Object>();
obj.add(1);
obj.add("selenium");
obj.add(2);
obj.add("selm");
obj.add(1>7);
obj.add('a');
// Print array list in 1st way
System.out.println(obj);
//Print in 2nd way
for(Object abc: obj) {
	System.out.println("Array sorting=" +abc);
	
	//3rd way by using iterator 
	Iterator ac=obj.iterator();
	while (ac.hasNext()) {
		System.out.println("while loop="+   ac.next() );
		
	}
}
	}

}
