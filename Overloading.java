package Java_practice1;

public class Overloading {
int a=2000;
 
public void k1(String name, int dob) {
	System.out.println("name="+ name + " dob=" +dob  );
	
}
public void k1(int a, long b) {
	System.out.println("pin="+4353+ "salary= "+4000);
}

public static void main(String[] args) {
	Overloading vvv= new Overloading();
	vvv.k1("Raju", 2009873);
	vvv.k1(3773, 40000);
	vvv.k1("koli", 209873);
	vvv.k1(32773, 40060);
	System.out.println(vvv.a);
}
}
