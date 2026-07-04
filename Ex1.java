package Array;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{int a=5/0;
	}

catch (ArithmeticException a) {
	a.printStackTrace();
	System.out.println(a);
}
catch (NullPointerException n) {
	System.out.println(n);
}
catch (IndexOutOfBoundsException b) {
	System.out.println(b);
}
catch (Exception e) {
System.out.println(e);
}

	System.out.println("Exception handlled ");}

}
