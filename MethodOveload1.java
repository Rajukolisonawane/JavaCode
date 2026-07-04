package Java_practice1;

public class MethodOveload1 {
void rk(int a) {
	System.out.println("First Method is nonstatic");
}
void rk(int b,int c) {
	System.out.println("Second Method is nonstatic="+b +c);
	
}
static void rk(String g) {
	System.out.println("Third method="+g);
}
public static void main(String[] args) {
	rk("raju koli");
	MethodOveload1 k=new MethodOveload1();
	k.rk(1000);
	k.rk(56, 0);
}
}