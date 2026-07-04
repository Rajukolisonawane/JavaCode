package Java_practice1;

import java.util.Scanner;

public class AreaOfCircle {

		public static void main(String[] args) {
			Scanner b= new Scanner(System.in);
			System.out.println("Enter the value of Radius= ");
			int R=b.nextInt();
			
			
//Area=Pi*R*R
//Circumference=2*pi*R
System.out.println("Area of Circle="+ Math.PI*R*R);
System.out.println("Circumference of circle="+2*Math.PI*R);

	}

}
