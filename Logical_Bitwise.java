package Java_practice1;

public class Logical_Bitwise {

	
	boolean a=20<30; //true
	boolean b=4<30;  // true
	boolean c=50<30;// false 
	boolean d=20==20; //true
	boolean e=20!=30;  //true
	
	
public void logical() {   // Does not check second condition if first condition is false
	System.out.println(a&&b);  //true
	System.out.println(c&&b);  //false
	System.out.println(d&&e);  //true
	System.out.println(a&&e);  //true\
	System.out.println(a&&b);  //true
	}
public void Bitwise() {   // always check both codition
	System.out.println(a&b);  //true
	System.out.println(c&b);  //false
	System.out.println(d&e);  //true
	System.out.println(a&e);  //true\
	System.out.println(a&b);  }//true
	
public static void main(String[] args) {
	Logical_Bitwise k=new Logical_Bitwise();
	k.logical();
	k.Bitwise();
}
}
