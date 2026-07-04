package Java_practice1;

public class Variable {
	String name ="raju";
	int gv=29; //  global variable
	static int sgv=788;
	
	static void m1() {
int b=67;// local variable
System.out.println("Local variable=" +b);
	}
	public static void main(String[] args) {
int a=20;//Local variable
System.out.println("global variable-"+ sgv);
Variable k=new Variable();
System.out.println(k.gv);
System.out.println(k.name);
m1();

	}

}
