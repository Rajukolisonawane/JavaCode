package Java_practice1;

public class Inter_rel_Implementation implements Interface_Inter_relation {

	@Override
	public void amazone() {
		System.out.println(1);}

	@Override
	public void amazone1() {
System.out.println(2);}

	@Override
	public void k4() {
		System.out.println(3);}

	@Override
	public void k5() {
		System.out.println(4);}

	@Override
	public void k6() {System.out.println(5);}

	public static void main(String[] args) {
		Inter_rel_Implementation j=new Inter_rel_Implementation();
		j.amazone();
		j.amazone1();
		j.k4();
		j.k5();
		j.k6();
	}
}
