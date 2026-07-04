package Java_practice1;

public class Absta_Interface_Imple extends Flipcart{

	@Override
	public void amazone() {
		System.out.println("Method 1 from Interface");}
@Override
	public void amazone1() {
		System.out.println("Method 2 from Interface");	}
@Override
	void k1() {
		System.out.println("Method 1 from Interface");	}
@Override
	void k2() {
		System.out.println("Method 1 from Interface");
		
}
public static void main(String[] args) {
	Absta_Interface_Imple k=new Absta_Interface_Imple();
	k.amazone();
	k.amazone1();
	k.k1();
	k.k2();
	k3();
}

}
