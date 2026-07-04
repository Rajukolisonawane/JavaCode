package Java_practice1;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner b= new Scanner(System.in);
		//Area (A): (A=a^{2} (Side multiplied by itself).&Perimeter (P): (P=4a\) (4 times the side length). 
		System.out.println("Enter the value of side= ");
		int side=b.nextInt();
		
		System.out.println("Area of Suare ="+Math.multiplyExact(side, side));
		System.out.println("circumference of Square="+4*side);
	}

}
