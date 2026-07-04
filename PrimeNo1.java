package logic;

import java.util.Scanner;

public class PrimeNo1 {

	public static void main(String[] args) {
		
			
		Scanner s=new Scanner(System.in)	;
		System.out.println("enter Number");
		int k=s.nextInt();
		if(isPrime(k)) {
			System.out.println("isprime");
		}
		else {
			System.out.println("Not prime");
		}
		}
public static Boolean isPrime(int num) {
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
	}

