package Java_practice1;

public class Constructor3 extends Constructor2 {
Constructor3(){
	super(900);
	
	System.out.println("super 4");
		
	
}
public static void main(String[] args) {
	new Constructor3();
	new Constructor1(100);
}

	
}

