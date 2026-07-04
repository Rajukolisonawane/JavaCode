package Java_practice1;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		Scanner b= new Scanner(System.in);
			//Area formula is A = L × W, and the Perimeter (or circumference) formula is P = 2(L + W)
			System.out.println("Enter the value of L= ");
			int Lengh=b.nextInt();
			System.out.println("Enter the value of W= ");
			int width=b.nextInt();
			System.out.println("Area of rectangle ="+Lengh*width);
			System.out.println("circumference of rectangle="+2*Math.addExact(Lengh, width));
			
		}}

