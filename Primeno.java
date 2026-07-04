package logic;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Pleasew enter the no=");
int k = s.nextInt();
if(isPrime(k)) {
	System.out.println("Is prime no");
}
else {
	System.out.println("Not prime no");
		
}}
	public static Boolean isPrime(int n) {

		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
			return false;	
			}}
			return true;
		}
	}


