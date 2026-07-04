package logic;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
System.out.println("Enter first no");
int a=s.nextInt();
System.out.println("Enter second no");
int b=s.nextInt();

System.out.println("before Swapping a="+a + " & b="+b);
int c=a;
a=b;
b=c;

System.out.println("After Swapping a="+a + " & b="+b);
	}

}
