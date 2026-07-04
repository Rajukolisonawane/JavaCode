package Java_practice1;

public class Hierachical_inheritance extends parent {
static void childk1() {
System.out.println("Hierachical 1");
}
static void childk2() {
System.out.println("Hierachical 2");

}

public static void main(String[] args) {
	Hierachical_inheritance k=new Hierachical_inheritance();
	k.parent2();
	parent1();
	childk1();
	childk2();
	
	}

}