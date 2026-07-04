package Java_practice1;

public class This1 {
This1(int a){
	System.out.println("1st method");
	}


This1(String a){
	this(199);
	System.out.println("2nd method");
	}

This1(){
	this("raju");
	
	System.out.println("3rd method");
	}

public static void main(String[] args) {
	new This1();
}
}
