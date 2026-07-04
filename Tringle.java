package Java_practice1;

import java.util.Scanner;

public class Tringle {
	public static void main(String[] args) {
		Scanner b= new Scanner(System.in);
//		Triangle Circumference=a+b+c  (three side addition)
//		Triangle area=1/2*b*h(base  *height)/2
//		System.out.println("Enter the value of a= ");
//		int a=b.nextInt();
//		System.out.println("Enter the value of c= ");
//		int c=b.nextInt();
////		System.out.println("Enter the value of d= ");
////		int d=b.nextInt();
////	System.out.println("Circumferenece of triangele="+Math.addExact( a+c, d));	
		
		System.out.println("Enter the value of height= ");
		int height=b.nextInt();
		System.out.println("Enter the value of base= ");
		int base=b.nextInt();
		System.out.println("Area opf triangle= "+height*base/2);
	
		
}}
