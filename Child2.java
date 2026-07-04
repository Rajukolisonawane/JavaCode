package Java_practice1;

public class Child2 extends Child1 {
static void son2() {
	System.out.println("son2 bat");
}
void son3() {
	System.out.println("Son3 Ball");
}
public static void main(String[] args) {
	son2();
	child_1();
	parent1();
	Child2 mli=new Child2();
	mli.child_2();
	mli.son3();
	mli.parent2();
	}
}

