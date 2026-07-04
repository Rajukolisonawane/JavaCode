package Java_practice1;

import java.io.InputStream;

public class Scanner {



	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("Enter first number");
		int h = s.nextInt();
		System.out.println("Enter second number");
		System.out.println(s.nextInt()+h);
	
	}

}
