package Java_practice1;

public class Logical_Bitwise_OR {
	boolean a=20<30; //true
	boolean b=4>30;  // false
	boolean c=50<30;// false 
	boolean d=20==20; //true
	boolean e=20!=30;  //true
	
	
public void logical() {   //does not  checkn second condition if first is true
	System.out.println(a||b);  //true
	System.out.println(c||b);  //false
	System.out.println(d||e);  //true
	System.out.println(a||e);  //true\
	System.out.println(a||b);  //true
	}
public void Bitwise() {
	System.out.println(a|b);  //true
	System.out.println(c|b);  //false
	System.out.println(d|e);  //true
	System.out.println(a|e);  //true\
	System.out.println(a|b);  }//true
	
public static void main(String[] args) {
	Logical_Bitwise_OR k=new Logical_Bitwise_OR();
	k.logical();
	k.Bitwise();
}
}
